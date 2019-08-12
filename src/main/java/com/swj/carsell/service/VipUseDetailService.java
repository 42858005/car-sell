package com.swj.carsell.service;

import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.vo.VipConsumeVo;

import java.util.List;
import java.util.Map;

public interface VipUseDetailService {
    int addVipUseDetail (VipUseDetail vipUseDetail);

    int updateUseDetail(VipUseDetail vipUseDetail);

    List<VipUseDetail> selectByUseDetail(VipUseDetail vipUseDetail);

    Map<String, Object> selectConsumeDetail(VipUseDetail vipUseDetail, int currentPage, int pageSize);

    int deleteByPrimaryKey(VipUseDetail vipUseDetail);
}
