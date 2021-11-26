package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public abstract class Infantry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private InfantryType type;

    private Integer moveSpeed;

    private Integer durability;

    private Integer attack;

    public Infantry(InfantryType type, Integer moveSpeed, Integer durability, Integer attack) {
        this.type = type;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
