package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Gender;
import dev.germantovar.springboot.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService implements IGenderService{

    @Autowired
    private GenderRepository repository;



    @Override
    public List<Gender> getAll(){

        return (List<Gender>) repository.findAll();
    }
}
