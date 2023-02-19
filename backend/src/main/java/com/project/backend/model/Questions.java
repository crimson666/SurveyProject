package com.project.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "question_table")
public class Questions {
    @Id // unique+not null
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String dop;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pno;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String product;

    @Column
    private String rating;
}

