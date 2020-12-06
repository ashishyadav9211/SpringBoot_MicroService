package com.codingtest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String emailId;

    //getters and setters
}