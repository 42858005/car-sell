package com.swj.carsell.model;

import javax.persistence.*;

public class Xm {
    @Id
    private Integer id;

    @Column(name = "xm_name")
    private String xmName;

    @Column(name = "xm_much")
    private Double xmMuch;

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
     * @return xm_name
     */
    public String getXmName() {
        return xmName;
    }

    /**
     * @param xmName
     */
    public void setXmName(String xmName) {
        this.xmName = xmName;
    }

    /**
     * @return xm_much
     */
    public Double getXmMuch() {
        return xmMuch;
    }

    /**
     * @param xmMuch
     */
    public void setXmMuch(Double xmMuch) {
        this.xmMuch = xmMuch;
    }
}