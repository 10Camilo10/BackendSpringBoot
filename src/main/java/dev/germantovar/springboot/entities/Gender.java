package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
<<<<<<<< HEAD:src/main/java/dev/germantovar/springboot/entities/Author.java
@Table(name = "author")
========
@Table(name = "gender")
>>>>>>>> origin/Marlon:src/main/java/dev/germantovar/springboot/entities/Gender.java
@Setter
@Getter
@ToString
@EqualsAndHashCode
<<<<<<<< HEAD:src/main/java/dev/germantovar/springboot/entities/Author.java
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author_name;
    private String information;
    private String country;
========
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gender_name;
    private String gender_description;


>>>>>>>> origin/Marlon:src/main/java/dev/germantovar/springboot/entities/Gender.java
}


