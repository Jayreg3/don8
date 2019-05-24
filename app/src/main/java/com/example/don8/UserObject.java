package com.example.don8;

public class UserObject {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private boolean veggies;
    private boolean fruit;
    private boolean grains;
    private boolean cans;
    private boolean meals;
    private boolean dropOff;

    UserObject(String name,
             String email,
             String password,
             String phoneNumber,
             String address,
             String city,
             String state,
             String zipCode,
             boolean veggies,
             boolean fruit,
             boolean grains,
             boolean cans,
             boolean meals,
             boolean dropOff) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.veggies = veggies;
        this.fruit = fruit;
        this.grains = grains;
        this.cans = cans;
        this.meals = meals;
        this.dropOff = dropOff;

    }
}
