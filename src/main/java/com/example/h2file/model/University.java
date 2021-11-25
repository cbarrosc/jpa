package com.example.h2file.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "University")
@NoArgsConstructor
@Getter
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "university_id")
    private List<Student> students = new ArrayList<>();

    public University(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }
}
