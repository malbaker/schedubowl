package com.example.bowlingexample.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;

@Document(collection = "Reservation")
public class Reservation {

    @Id
    private String id;

    private User user;

    public Reservation() {

    }


}
