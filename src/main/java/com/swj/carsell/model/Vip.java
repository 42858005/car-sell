package com.swj.carsell.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
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
     * 车型
     */
    @Column(name = "car_type")
    private String carType;

    /**
     * 成为会员日期
     */
    @Column(name = "cr_date")
    private Date crDate;

    /**
     * 余额
     */
    private Double balance;

    /**
     * 积分
     */
    private Double score;

    /**
     * 奖励金暂时不用
     */
    @Column(name = "reward_balance")
    private Double rewardBalance;

    /**
     * 会员等级
     */
    @Column(name = "vip_level_id")
    private String vipLevelId;

    @Column(name = "open_id")
    private String openId;
}