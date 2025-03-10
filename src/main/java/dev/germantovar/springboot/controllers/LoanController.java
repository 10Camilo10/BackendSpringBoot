package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Loan;
import dev.germantovar.springboot.repository.LoanRepository;
import dev.germantovar.springboot.services.ILoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private ILoanService service;

    @Autowired
    private LoanRepository userRepository;

    @GetMapping("loan")
    public List<Loan> getAll() {return service.getAll();}

}
