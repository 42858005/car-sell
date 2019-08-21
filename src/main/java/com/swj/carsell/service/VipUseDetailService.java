package com.swj.carsell.service;

import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.vo.VipConsumeVo;

import java.util.List;
import java.util.Map;

public interface VipUseDetailService {
    int addVipUseDetail (VipUseDetail vipUseDetail);

    int updateUseDetail(VipUseDetail vipUseDetail);

    List<VipUseDetail> selectByUseDetail(VipUseDetail vipUseDetail);

    List<VipConsumeVo> selectConsumeDetail();

    int deleteByPrimaryKey(VipUseDetail vipUseDetail);

    /**查询首页消费记录(前20条)*/
    List<VipConsumeVo> selectFromIndex();
}
