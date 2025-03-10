package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Gender;

import java.util.List;

public interface IGenderService {
    List<Gender> getAll();

}

