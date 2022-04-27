package com.example.schedubowl.services;

import com.example.schedubowl.entities.Reservation;
import com.example.schedubowl.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepo;

    @Override
    public List<Reservation> userReservations(String email) {
        List<Reservation> reservationList = new ArrayList<Reservation>();
        for (Reservation res :
                reservationRepo.findByEmail(email)) {
            reservationList.add(0, res);
        }
        return reservationList;
    }
}
