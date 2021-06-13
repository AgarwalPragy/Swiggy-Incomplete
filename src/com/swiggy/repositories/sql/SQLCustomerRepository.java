package com.swiggy.repositories.sql;

import com.swiggy.models.Customer;
import com.swiggy.repositories.interfaces.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class SQLCustomerRepository implements CustomerRepository {
    DBConnection connection;


    @Override
    public void create(Customer object) {
        connection.execute("INSERT INTO TABLE CUSTOMER VALUES ()");
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
