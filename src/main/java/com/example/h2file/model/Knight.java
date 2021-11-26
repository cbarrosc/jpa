package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Knight extends Infantry{

    private Boolean shield;

    public Knight(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Boolean shield) {
        super(type, moveSpeed, durability, attack);
        this.shield = shield;
    }
}
