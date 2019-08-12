package com.swj.carsell.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Admin {
    @Id
    private String id;

    private String username;

    private String password;
}