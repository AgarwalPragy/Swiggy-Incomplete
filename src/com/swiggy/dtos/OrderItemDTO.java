package com.swiggy.dtos;

import java.util.List;

public class OrderItemDTO {
    @Getter @Setter
    private DishDTO dish;
    @Getter @Setter
    private Integer quantity;
    @Getter @Setter
    private List<DishCustomizationDTO> customizations;
}
