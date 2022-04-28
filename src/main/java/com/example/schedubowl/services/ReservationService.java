package com.example.schedubowl.services;

import com.example.schedubowl.entities.Reservation;
import com.example.schedubowl.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
ReservationInterface: Interface which declares methods we use to use our data within HTTP requests
 */
public interface ReservationService {
    List<Reservation> userReservations(String email);
    }

