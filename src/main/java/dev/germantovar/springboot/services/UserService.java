package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.User;
import dev.germantovar.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;



    @Override
    public List<User> getAll(){

        return (List<User>) repository.findAll();
    }
}
