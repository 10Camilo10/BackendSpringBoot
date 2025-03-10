package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Gender;
import dev.germantovar.springboot.repository.GenderRepository;
import dev.germantovar.springboot.services.IGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenderController {

    @Autowired
    private IGenderService service;

    @Autowired
    private GenderRepository userRepository;

    @GetMapping("gender")
    public List<Gender> getAll() {return service.getAll();}

}
