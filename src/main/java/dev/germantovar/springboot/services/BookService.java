package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Book;
import dev.germantovar.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    private BookRepository repository;



    @Override
    public List<Book> getAll(){

        return (List<Book>) repository.findAll();
    }
}
