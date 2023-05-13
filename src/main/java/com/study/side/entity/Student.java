package com.study.side.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 3, nullable = false)
    private long age;

}
