package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "PAINTING")
@NoArgsConstructor
public class Painting extends ArtPiece{

    @Enumerated(value = EnumType.STRING)
    private PaintingTechnique paintingTechnique;

    private Double width;

    private Double height;

    public Painting(String author, PaintingTechnique paintingTechnique, Double width, Double height) {
        super(author);
        this.paintingTechnique = paintingTechnique;
        this.width = width;
        this.height = height;
    }
}
