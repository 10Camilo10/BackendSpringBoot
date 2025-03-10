package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Review;
import dev.germantovar.springboot.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements IReviewService {

    @Autowired
    private ReviewRepository repository;

    @Override
    public List<Review> getAll(){

        return (List<Review>) repository.findAll();
    }
}
