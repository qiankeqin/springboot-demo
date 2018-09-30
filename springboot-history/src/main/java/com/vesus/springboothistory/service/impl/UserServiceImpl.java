package com.vesus.springboothistory.service.impl;

import com.vesus.springboothistory.model.User;
import com.vesus.springboothistory.repository.UserRepository;
import com.vesus.springboothistory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository ;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User book) {

    }

    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }
}
