package com.example.schedubowl.repository;


import com.example.schedubowl.entities.Reservation;
import com.example.schedubowl.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/*
    ReservationRepository: Java interface which serves to define methods in which we use to query our data
 */
public interface ReservationRepository extends MongoRepository<Reservation, String> {

    List<Reservation> findByEmail(String email);

}
