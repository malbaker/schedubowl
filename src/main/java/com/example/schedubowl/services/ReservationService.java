package com.example.schedubowl.services;

import com.example.schedubowl.entities.Reservation;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ReservationService implements UserDetailsService {


    /*
    Methods for creating reservations, modifying and deleting.
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    // @Query("{'email' : ?0}")
    // Reservation findResByEmail(String email);

}
