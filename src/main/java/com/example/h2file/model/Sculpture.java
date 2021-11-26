package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "SCULPTURE")
@NoArgsConstructor
public class Sculpture extends ArtPiece{

    @Enumerated(value = EnumType.STRING)
    private Material material;

    private Double weight;

    public Sculpture(String author, Material material, Double weight) {
        super(author);
        this.material = material;
        this.weight = weight;
    }
}
