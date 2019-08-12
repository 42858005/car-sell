package com.swj.carsell.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "vip_use_detail")
public class VipUseDetail {
    @Id
    private String id;

    /**
     * 项目
     */
    private Integer xmid;

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
    private Integer vipId;

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
     * 获取消费金额
     *
     * @return much - 消费金额
     */
    public Double getMuch() {
        return much;
    }

    /**
     * 设置消费金额
     *
     * @param much 消费金额
     */
    public void setMuch(Double much) {
        this.much = much;
    }

    /**
     * 获取消费日期
     *
     * @return detail_date - 消费日期
     */
    public Date getDetailDate() {
        return detailDate;
    }

    /**
     * 设置消费日期
     *
     * @param detailDate 消费日期
     */
    public void setDetailDate(Date detailDate) {
        this.detailDate = detailDate;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取公里数
     *
     * @return kilometer - 公里数
     */
    public Double getKilometer() {
        return kilometer;
    }

    /**
     * 设置公里数
     *
     * @param kilometer 公里数
     */
    public void setKilometer(Double kilometer) {
        this.kilometer = kilometer;
    }

    /**
     * 获取保险到期日
     *
     * @return insurance - 保险到期日
     */
    public Date getInsurance() {
        return insurance;
    }

    /**
     * 设置保险到期日
     *
     * @param insurance 保险到期日
     */
    public void setInsurance(Date insurance) {
        this.insurance = insurance;
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