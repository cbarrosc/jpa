package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FROST_SPELL")
@NoArgsConstructor
public class FrostSpell extends Spell{

    private boolean freezing;
    private Integer freezeDuration;

    public FrostSpell(String name, Integer energyCost, Integer damage, boolean freezing, Integer freezeDuration) {
        super(name, energyCost, damage);
        this.freezing = freezing;
        this.freezeDuration = freezeDuration;
    }
}
