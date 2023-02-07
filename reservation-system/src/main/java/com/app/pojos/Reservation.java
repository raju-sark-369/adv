package com.app.pojos;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Model class 

@Entity
@Table(name="reservation")
public class Reservation {
	
	@Id
	private Long id;
	
	@Column
	private LocalDateTime dt;

	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

// Hibernate will convert camel case column names to snake case!!!
// Don't use camelcase columns in DB
	@Column(name="party_size")
	private int partySize;
	public Reservation() {}
	
	public Reservation(Long id,  Long userId, int partySize) {
		this.id = id;
	
		this.userId = userId;
		this.partySize = partySize;
	}
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDt() {
		return dt;
	}

	public void setDt(LocalDateTime dt) {
		this.dt = dt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getPartySize() {
		return partySize;
	}

	public void setPartySize(int partySize) {
		this.partySize = partySize;
	}

}

CREATE DATABASE Annex_reservation;
USE Annex_reservation;
CREATE TABLE reservation (
`id` int(1) NOT NULL AUTO_INCREMENT,
`user_id` int(1) NOT NULL,
`party_size` tinyint(1) NOT NULL,
`date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`restaurant_id` int(1) NOT NULL, 
PRIMARY KEY (`id`)
) ENGINE=InnoDB CHARSET=utf8;
INSERT INTO reservation VALUES 
(NULL,100,2,NOW(),800), 
(NULL,101,3,NOW() + INTERVAL 1 DAY,800), 
(NULL,102,5,NOW() + INTERVAL 2 DAY,800)