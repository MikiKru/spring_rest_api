package com.example.spring_rest_api.repository;

import com.example.spring_rest_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // inerface for commands querries based on specified entity
public interface UserRepository extends JpaRepository<User, Integer> {
    // JpaRepository implement CRUD operations
    // -> C CREATE
    // -> R READ
    // -> U UPDATE
    // -> D DELETE
    // here we can implement abstract method understanding for mysql db

}
