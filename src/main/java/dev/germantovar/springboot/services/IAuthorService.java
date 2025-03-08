package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> getAll();

}

