package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	
// Retrieve all rows from table and populate list with objects
	public List getAllReservations() {
		List reservations = new ArrayList<>();
	reservationRepository.findAll().forEach(reservations::add);
		return reservations;
	}
	
// Retrieves one row from table based on given id
	public Reservation getReservation(Long id) {
		return reservationRepository.findOne(id);
	}
	
// Inserts row into table 
	public void addReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}
	
// Updates row in table
	public void updateReservation(Long id, Reservation reservation) {
		reservationRepository.save(reservation);
	}
	
// Removes row from table
	public void deleteReservation(Long id) {
		reservationRepository.delete(id);
	}
}
