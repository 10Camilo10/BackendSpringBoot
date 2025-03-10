package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.User;
import dev.germantovar.springboot.repository.UserRepository;
import dev.germantovar.springboot.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("user")
    public List<User> getAll() {return service.getAll();}

}
