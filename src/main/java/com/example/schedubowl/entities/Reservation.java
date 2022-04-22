package com.example.schedubowl.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "Reservation")
public class Reservation {

    @Id
    private String id;

    @Indexed(unique = true,direction = IndexDirection.DESCENDING)
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date date;


    private String timeMade;

    private User user;

    private int party;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getParty() {
        return party;
    }

    public void setParty(int party) {
        this.party = party;
    }

    public String getTimeMade() {
        return timeMade;
    }

    public void setTimeMade(String timeMade) {
        this.timeMade = timeMade;
    }
}
