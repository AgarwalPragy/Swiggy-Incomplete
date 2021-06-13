package com.swiggy.models;

public class Address extends Auditable {
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String zipcode;
}
