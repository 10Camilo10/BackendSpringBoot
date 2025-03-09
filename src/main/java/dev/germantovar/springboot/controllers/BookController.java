package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.repository.BookRepository;
import dev.germantovar.springboot.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private IBookService service;

    @Autowired
    private BookRepository userRepository;

    @GetMapping("book")
    public List<Book> getAll() {return service.getAll();}

}
