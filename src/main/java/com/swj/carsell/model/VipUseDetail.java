package com.swj.carsell.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "vip_use_detail")
public class VipUseDetail {
    @Id
    private String id;

    /**
     * 项目
     */
    private Integer xmid;

    private Double much;

    @Column(name = "detail_date")
    private Date detailDate;

    @Column(name = "vip_id")
    private Integer vipId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取项目
     *
     * @return xmid - 项目
     */
    public Integer getXmid() {
        return xmid;
    }

    /**
     * 设置项目
     *
     * @param xmid 项目
     */
    public void setXmid(Integer xmid) {
        this.xmid = xmid;
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
     * @return detail_date
     */
    public Date getDetailDate() {
        return detailDate;
    }

    /**
     * @param detailDate
     */
    public void setDetailDate(Date detailDate) {
        this.detailDate = detailDate;
    }

    /**
     * @return vip_id
     */
    public Integer getVipId() {
        return vipId;
    }

    /**
     * @param vipId
     */
    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }
}