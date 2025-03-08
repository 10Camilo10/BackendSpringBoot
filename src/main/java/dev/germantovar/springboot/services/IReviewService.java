package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Review;

import java.util.List;

public interface IReviewService {
    List<Review> getAll();

}

