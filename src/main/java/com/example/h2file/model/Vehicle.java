package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@NoArgsConstructor
public abstract class Vehicle {

    @Id
    @GeneratedValue
    private Long  id;

    private String name;

    private Integer seats;

    public Vehicle(String name, Integer seats) {
        this.name = name;
        this.seats = seats;
    }
}
