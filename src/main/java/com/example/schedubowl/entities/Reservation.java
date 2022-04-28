package com.example.schedubowl.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/*
Reservation class:
 */
@Document(collection = "test")
public class Reservation {

    @Id
    private String id;
    @Indexed(unique = true,direction = IndexDirection.DESCENDING)
    private String time;
    private String email;
    private String lanes;
    private String shoes;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanes() {
        return lanes;
    }

    public void setLanes(String lanes) {
        this.lanes = lanes;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
}


