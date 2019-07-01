package com.swj.carsell.model;

import javax.persistence.*;

@Table(name = "vip_level")
public class VipLevel {
    @Id
    private Integer id;

    @Column(name = "vip_name")
    private String vipName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return vip_name
     */
    public String getVipName() {
        return vipName;
    }

    /**
     * @param vipName
     */
    public void setVipName(String vipName) {
        this.vipName = vipName;
    }
}