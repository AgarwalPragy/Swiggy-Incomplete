package com.swiggy.controllers;

import com.swiggy.dtos.CustomerDTO;
import com.swiggy.dtos.UserDTO;
import com.swiggy.models.Customer;
import com.swiggy.repositories.interfaces.CustomerRepository;
import com.swiggy.services.encoding.PasswordEncoder;

public class CustomerController {
    private PasswordEncoder passwordEncoder;
    private CustomerRepository customerRepository;

    // you want to inject your dependencies rather than deciding/creating them yourself

    public CustomerController(PasswordEncoder passwordEncoder,
                              CustomerRepository customerRepository) {
        this.passwordEncoder = passwordEncoder;
        this.customerRepository = customerRepository;
    }

    Customer register(CustomerDTO details, UserDTO loginDetails) {
        String hashedSaltedPassword = passwordEncoder.encode(loginDetails.getPassword(), loginDetails.getUsername());
        Customer customer = new Customer(
                details.getPhoneNumber(),
                details.getName(),
                loginDetails.getUsername(),
                hashedSaltedPassword
        );
        customerRepository.create(customer);
        return customer;
    }
}
