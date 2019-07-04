package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.VipUseDetailMapper;
import com.swj.carsell.mapper.XmMapper;
import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.service.XmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class VipUseDetailServiceImpl implements VipUseDetailService {

    @Autowired
    private VipUseDetailMapper vipUseDetailMapper;


    @Override
    public int addVipUseDetail(VipUseDetail vipUseDetail) {
        vipUseDetail.setDetailDate(new Date());

        return vipUseDetailMapper.insertSelective(vipUseDetail);

    }
}