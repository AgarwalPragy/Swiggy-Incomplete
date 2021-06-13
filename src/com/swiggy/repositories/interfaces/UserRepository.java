package com.swiggy.repositories.interfaces;

import com.swiggy.models.User;

import java.util.Optional;

public interface UserRepository
        extends IRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
