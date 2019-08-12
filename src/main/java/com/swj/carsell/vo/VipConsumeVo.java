package com.swj.carsell.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class VipConsumeVo implements Serializable {
    private String id;
    private String name;    //消费人姓名
    private String tel;     //手机号
    private String carNumber;   //车牌号
    private String carType;     //车型
    private Integer xmid;   //项目
    private Double much;    //消费金额
    private Date detailDate;    //消费日期
    private String remarks;     //备注

    private Double balance;     //余额
    private Double score;   //积分
    private Double kilometer;   //公里数
    private Date insurance;     //保险到期日

    private Double rewardBalance;   //奖励金暂时不用
    private String vipLevelId;     //会员等级
    private String vipId;

}