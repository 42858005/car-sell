package com.swj.carsell.service;

import com.swj.carsell.model.VipMuchDetail;
import com.swj.carsell.model.VipUseDetail;

import java.util.List;

public interface VipMuchDetailService {
    int addMuchDetail(VipMuchDetail vipMuchDetail);

    int updateMuchDetail(VipMuchDetail vipMuchDetail);

    List<VipMuchDetail> selectByMuchDetail(VipMuchDetail vipMuchDetail);

    int deleteByPrimaryKey(VipMuchDetail vipMuchDetail);
}
