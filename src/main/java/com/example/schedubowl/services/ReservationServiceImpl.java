package com.example.schedubowl.services;

import com.example.schedubowl.entities.Reservation;
import com.example.schedubowl.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
ReservationServiceImpl: Class which defines methods from ReservationService
 */
@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepo;

    /*
    ReservationServiceImpl.userReservations(String) accepts a String as its lone parameter.
    From this email string we will query the database to find reservation where the email field matches
    the inputted String. We store these reservations in a list which is used as our return value.
     */
    @Override
    public List<Reservation> userReservations(String email) {
        List<Reservation> reservationList = new ArrayList<Reservation>(reservationRepo.findByEmail(email));
        return reservationList;
    }
}
