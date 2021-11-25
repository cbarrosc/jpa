package com.example.h2file.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Item")
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item(String serialNumber, Cart cart) {
        this.serialNumber = serialNumber;
        this.cart = cart;
    }
}
