package com.example.schedubowl.repository;


import com.example.schedubowl.entities.Reservation;
import com.example.schedubowl.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, User> {

    Reservation findByUser(User user);

}
