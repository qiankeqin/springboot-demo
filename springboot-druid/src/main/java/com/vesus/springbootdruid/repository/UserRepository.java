package com.vesus.springbootdruid.repository;

import com.vesus.springbootdruid.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    @Query("select l from User l ")
    public List<User> findAll();
}
