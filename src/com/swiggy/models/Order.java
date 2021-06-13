package com.swiggy.models;

import java.util.List;

public class Order extends Auditable {
    @Getter @Setter
    private List<OrderItem> items;
    @Getter @Setter
    private Customer customer;
    @Getter @Setter
    private Address address;
}
