package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Archer extends Infantry{

    private Integer range;

    public Archer(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
        super(type, moveSpeed, durability, attack);
        this.range = range;
    }
}
