package com.swj.carsell.model;

import javax.persistence.*;
import java.util.Date;

public class Vip {
    @Id
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String tel;

    /**
     * 车牌号
     */
    @Column(name = "car_number")
    private String carNumber;


    /**
     * 成为会员日期
     */
    @Column(name = "cr_date")
    private Date crDate;

    /**
     * 会员等级
     */
    @Column(name = "vip_level_id")
    private Integer vipLevelId;

    @Column(name = "open_id")
    private String openId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }


    /**
     * 获取成为会员日期
     *
     * @return cr_date - 成为会员日期
     */
    public Date getCrDate() {
        return crDate;
    }

    /**
     * 设置成为会员日期
     *
     * @param crDate 成为会员日期
     */
    public void setCrDate(Date crDate) {
        this.crDate = crDate;
    }

    /**
     * 获取会员等级
     *
     * @return vip_level_id - 会员等级
     */
    public Integer getVipLevelId() {
        return vipLevelId;
    }

    /**
     * 设置会员等级
     *
     * @param vipLevelId 会员等级
     */
    public void setVipLevelId(Integer vipLevelId) {
        this.vipLevelId = vipLevelId;
    }

    /**
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
}