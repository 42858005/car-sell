package com.swj.carsell.model;

import javax.persistence.*;

@Table(name = "vip_level")
public class VipLevel {
    @Id
    private String id;

    @Column(name = "vip_name")
    private String vipName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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