package com.swj.carsell.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Xm {
    @Id
    private String id;

    @Column(name = "xm_name")
    private String xmName;

    @Column(name = "xm_much")
    private Double xmMuch;
}