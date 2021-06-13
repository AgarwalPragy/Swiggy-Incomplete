package com.swiggy.models;

import java.util.List;

public class Customer extends User {
    @Getter @Setter
    private List<Address> addresses;
    @Getter @Setter
    private String phoneNumber;
    @Getter
    private String name;

    private List<Order> orders;

    public Customer(String phoneNumber, String name, String username, String password) {
        super(username, password);
        this.phoneNumber = phoneNumber;
        setName(name);
    }

    public void setName(String name) {
        if(name.length() > 80) {

        }
        this.name = name;
    }
}
