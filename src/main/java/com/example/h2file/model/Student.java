package com.example.h2file.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String indexNumber;

    public Student(String indexNumber) {
        this.indexNumber = indexNumber;
    }
}
