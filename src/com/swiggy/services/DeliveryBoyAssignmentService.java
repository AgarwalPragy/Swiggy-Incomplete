package com.swiggy.services;

import com.swiggy.models.Order;

public class DeliveryBoyAssignmentService {
    public void assignForOrder(Order order) {
        smsService.notifyDeliveryPersonnel(order);
        order.setStatus(OrderStatus.AssigningDeliveryPersonnel);
    }
}
