package dev.germantovar.springboot.repository;

<<<<<<<< HEAD:src/main/java/dev/germantovar/springboot/repository/AuthorRepository.java
import dev.germantovar.springboot.entities.Author;
========
import dev.germantovar.springboot.entities.Book;
>>>>>>>> origin/Marlon:src/main/java/dev/germantovar/springboot/repository/BookRepository.java
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<<< HEAD:src/main/java/dev/germantovar/springboot/repository/AuthorRepository.java
public interface AuthorRepository extends CrudRepository<Author, Long> {
========
public interface BookRepository extends CrudRepository<Book, Long> {
>>>>>>>> origin/Marlon:src/main/java/dev/germantovar/springboot/repository/BookRepository.java
}
