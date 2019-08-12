package com.swj.carsell.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "vip_much_detail")
public class VipMuchDetail {
    @Id
    private String id;

    private Double much;

    /**
     * 积分
     */
    private Double point;

    /**
     * 奖励金暂时不用
     */
    @Column(name = "jl_much")
    private Double jlMuch;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
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
     * 获取积分
     *
     * @return point - 积分
     */
    public Double getPoint() {
        return point;
    }

    /**
     * 设置积分
     *
     * @param point 积分
     */
    public void setPoint(Double point) {
        this.point = point;
    }

    /**
     * 获取奖励金暂时不用
     *
     * @return jl_much - 奖励金暂时不用
     */
    public Double getJlMuch() {
        return jlMuch;
    }

    /**
     * 设置奖励金暂时不用
     *
     * @param jlMuch 奖励金暂时不用
     */
    public void setJlMuch(Double jlMuch) {
        this.jlMuch = jlMuch;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}