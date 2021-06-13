package com.swiggy.models;

public class DishCustomization extends Auditable {
    @Getter @Setter
    private Dish dish;
    @Getter @Setter
    private String customizationName;
}
