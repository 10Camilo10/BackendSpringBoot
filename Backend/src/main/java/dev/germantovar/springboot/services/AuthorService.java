package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Author;
import dev.germantovar.springboot.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {

    @Autowired
    private AuthorRepository repository;



    @Override
    public List<Author> getAll(){

        return (List<Author>) repository.findAll();
    }
}
