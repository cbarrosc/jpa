package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FIRE_SPELL")
@NoArgsConstructor
public class FireSpell extends Spell{

    private Integer damageOverTime;
    private Integer damageOverTimeDuration;

    public FireSpell(String name, Integer energyCost, Integer damage, Integer damageOverTime, Integer damageOverTimeDuration) {
        super(name, energyCost, damage);
        this.damageOverTime = damageOverTime;
        this.damageOverTimeDuration = damageOverTimeDuration;
    }
}
