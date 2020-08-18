package com.example.demo.Entity;

import com.example.demo.UserSerializer;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.validation.constraints.*;


import javax.persistence.*;

import java.util.*;

@Entity
@JsonSerialize(using = UserSerializer.class)
@Table(name = "user")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull(message="First Name cannot be null")
    private String firstName;
    @NotNull(message="Last Name can not be null")
    private  String lastName;
    @Min(value = 15, message = "Age could not be less than 15")
    @Max(value = 65, message = "Age cannot be greater than 65")
    private int age;
    private String email;

    public User() {
    }

    public User(int id, String firstName, String lastName, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
