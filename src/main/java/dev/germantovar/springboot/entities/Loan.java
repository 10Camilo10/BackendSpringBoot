package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sun.jvm.hotspot.ui.EditableAtEndDocument;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "loan")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String book;
    private Date date_loan;
    private Date date_return;



}


