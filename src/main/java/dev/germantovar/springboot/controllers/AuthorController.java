package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Author;
import dev.germantovar.springboot.repository.AuthorRepository;
import dev.germantovar.springboot.services.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private IAuthorService service;

    @Autowired
    private AuthorRepository userRepository;

    @GetMapping("author")
    public List<Author> getAll() {return service.getAll();}

}
