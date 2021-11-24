package com.example.h2file.model.onetooneunidirectional;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "User")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
