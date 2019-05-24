package com.example.don8;

import java.io.Serializable;

public class Transaction implements Serializable {
    private final String name;
    private final String date;
    private final String status;

    public Transaction(String name, String date, String status) {
        this.name = name;
        this.date = date;
        this.status = status;

    }

    public String getName() { return name; }
    public String getStatus() { return status; }
    public String getDate() { return date; }
    @Override
    public String toString() { return "Charity: " + name + "\nStatus: " + status + "\nDate:" + date; }
}
