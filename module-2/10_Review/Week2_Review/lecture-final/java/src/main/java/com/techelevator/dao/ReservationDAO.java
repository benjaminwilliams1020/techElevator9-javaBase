package com.techelevator.dao;

import com.techelevator.model.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationDAO {

    int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate);

    List<Reservation> findUpcomingReservationsForPark(int parkId);

}
