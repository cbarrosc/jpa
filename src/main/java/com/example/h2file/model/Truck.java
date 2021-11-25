package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Truck extends Vehicle{

    private Integer maxLoad;
    private Boolean sleeperCab;

    public Truck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
        super(name, seats);
        this.maxLoad = maxLoad;
        this.sleeperCab = sleeperCab;
    }
}
