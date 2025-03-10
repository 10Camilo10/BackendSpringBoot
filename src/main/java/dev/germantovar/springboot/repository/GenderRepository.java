package dev.germantovar.springboot.repository;

import dev.germantovar.springboot.entities.Gender;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends CrudRepository<Gender, Long> {
}
