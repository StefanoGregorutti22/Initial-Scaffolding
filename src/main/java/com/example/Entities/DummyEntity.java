package com.example.Entities;

import jakarta.persistence.*;

@Entity
public class DummyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Tiene que ser del tipo Identity
    @Column(name = "id", nullable = false)
    private Long id;

    private String dummy;

}
