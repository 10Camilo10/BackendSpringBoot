package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Review;
import dev.germantovar.springboot.repository.ReviewRepository;
import dev.germantovar.springboot.services.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private IReviewService service;

    @Autowired
    private ReviewRepository userRepository;

    @GetMapping("review")
    public List<Review> getAll() {return service.getAll();}

}
