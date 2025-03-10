package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Loan;

import java.util.List;

public interface ILoanService {
    List<Loan> getAll();

}

