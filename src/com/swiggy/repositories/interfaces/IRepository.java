package com.swiggy.repositories.interfaces;

import java.util.List;
import java.util.Optional;

public interface IRepository<Entity, Id> {
    void create(Entity object);

    void save(Entity object);

    Optional<Entity> findById(Id id);

    List<Entity> findAll();

    void delete(Id id);
}
