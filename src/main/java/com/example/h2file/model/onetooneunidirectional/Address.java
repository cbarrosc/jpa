package com.example.h2file.model.onetooneunidirectional;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Adress")
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;

    public Address(String street) {
        this.street = street;
    }
}
