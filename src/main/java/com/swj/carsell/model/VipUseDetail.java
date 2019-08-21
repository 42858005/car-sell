package com.swj.carsell.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "vip_use_detail")
@Data
public class VipUseDetail {
    @Id
    private String id;

    /**
     * 项目
     */
    private String xmId;

    /**
     * 消费金额
     */
    private Double much;

    /**
     * 消费日期
     */
    @Column(name = "detail_date")
    private Date detailDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 公里数
     */
    private Double kilometer;

    /**
     * 保险到期日
     */
    private Date insurance;

    @Column(name = "vip_id")
    private String vipId;
}