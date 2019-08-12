package com.swj.carsell.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "vip_level")
@Data
public class VipLevel {
    @Id
    private String id;

    @Column(name = "vip_name")
    private String vipName;
}