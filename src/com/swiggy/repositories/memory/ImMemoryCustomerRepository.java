package com.swiggy.repositories.memory;

import com.swiggy.models.Customer;
import com.swiggy.repositories.interfaces.CustomerRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class ImMemoryCustomerRepository implements CustomerRepository {
    Map<Long, Customer> customers;
    Counter id;

    public ImMemoryCustomerRepository() {
        this.customers = new HashMap<>();
        this.id = new Counter(0);
    }

    @Override
    public void create(Customer object) {
        object.setId(id.getNext());
        customers.put(object.getId(), object);
    }

    @Override
    public void save(Customer object) {

    }

    @Override
    public Optional<Customer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
