package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Loan;
import dev.germantovar.springboot.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService implements ILoanService{

    @Autowired
    private LoanRepository repository;



    @Override
    public List<Loan> getAll(){

        return (List<Loan>) repository.findAll();
    }
}
