package com.swj.carsell.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "vip_much_detail")
public class VipMuchDetail {
    @Id
    private Integer id;

    private Double much;

    @Column(name = "jl_much")
    private Double jlMuch;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return much
     */
    public Double getMuch() {
        return much;
    }

    /**
     * @param much
     */
    public void setMuch(Double much) {
        this.much = much;
    }

    /**
     * @return jl_much
     */
    public Double getJlMuch() {
        return jlMuch;
    }

    /**
     * @param jlMuch
     */
    public void setJlMuch(Double jlMuch) {
        this.jlMuch = jlMuch;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}