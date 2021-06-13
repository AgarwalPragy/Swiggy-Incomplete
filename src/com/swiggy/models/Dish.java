package com.swiggy.models;

import java.util.List;

public class Dish extends Auditable {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private List<DishCustomization> customizations;
}
