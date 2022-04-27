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

    private String resTimeDate;

    private String email;

    private String lanes;

    private String shoeSizes;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResTimeDate() {
        return resTimeDate;
    }

    public void setResTimeDate(String resTimeDate) {
        this.resTimeDate = resTimeDate;
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

    public String getShoeSizes() {
        return shoeSizes;
    }

    public void setShoeSizes(String shoeSizes) {
        this.shoeSizes = shoeSizes;
    }
}


