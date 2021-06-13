package com.swiggy.models;

import java.util.List;

public class OrderItem extends Auditable {
    @Getter
    @Setter
    private Order order;
    @Getter
    @Setter
    private Dish dish;
    @Getter
    @Setter
    private Integer quantity;
    @Getter
    @Setter
    private List<DishCustomizations> customizations;
}
