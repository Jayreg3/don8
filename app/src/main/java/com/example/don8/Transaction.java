package com.example.don8;

import java.io.Serializable;

public class Transaction implements Serializable {
    private final String name;
    private final String date;
    private final String status;
    //private final String image;

    public Transaction(String name, String date, String status){//, String image) {
        this.name = name;
        this.date = date;
        this.status = status;
        //this.image = image;

    }

    public String getName() { return name; }
    public String getStatus() { return status; }
    public String getDate() { return date; }
    @Override
    public String toString() { return "Charity: " + name + "\nStatus: " + status + "\nDate:" + date; }
}
