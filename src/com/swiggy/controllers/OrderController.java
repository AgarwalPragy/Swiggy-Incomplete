package com.swiggy.controllers;

import com.swiggy.dtos.CustomerDTO;
import com.swiggy.dtos.UserDTO;
import com.swiggy.models.Customer;
import com.swiggy.repositories.interfaces.CustomerRepository;
import com.swiggy.services.DeliveryBoyAssignmentService;
import com.swiggy.services.encoding.PasswordEncoder;

public class OrderController {
    private DeliveryBoyAssignmentService deliveryBoyAssignmentService;
    // you want to inject your dependencies rather than deciding/creating them yourself

    public void submitOrder(Long orderId) {
        Order order = orderRepository.findOrderById(orderId);
        order.markAccepted();
        // the below call should be non-blocking
        // we have to now assign a delivery person to this order
        deliveryBoyAssignmentService.assignForOrder(order);
    }
}
