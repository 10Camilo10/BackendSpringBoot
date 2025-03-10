package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();

}

