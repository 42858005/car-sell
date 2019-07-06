package com.swj.carsell.service;

import com.swj.carsell.model.VipUseDetail;

import java.util.List;

public interface VipUseDetailService {
    int addVipUseDetail (VipUseDetail vipUseDetail);

    int updateUseDetail(VipUseDetail vipUseDetail);

    List<VipUseDetail> selectByUseDetail(VipUseDetail vipUseDetail);

    int deleteByPrimaryKey(VipUseDetail vipUseDetail);
}
