package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();

}

