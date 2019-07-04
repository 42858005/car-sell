package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.VipMapper;
import com.swj.carsell.mapper.VipMuchDetailMapper;
import com.swj.carsell.model.Vip;
import com.swj.carsell.model.VipMuchDetail;
import com.swj.carsell.service.VipMuchDetailService;
import com.swj.carsell.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class VipMuchDetailServiceImpl implements VipMuchDetailService {

    @Autowired
    private VipMuchDetailMapper vipMuchDetailMapper;


    @Override
    public int addMuchDetail(VipMuchDetail vipMuchDetail) {
        vipMuchDetail.setUpdateTime(new Date());

        return vipMuchDetailMapper.insertSelective(vipMuchDetail);

    }

    @Override
    public int updateMuchDetail(VipMuchDetail vipMuchDetail) {
        //vip.setCrDate(new Date());
        vipMuchDetail.setUpdateTime(new Date());

        return vipMuchDetailMapper.updateByPrimaryKeySelective(vipMuchDetail);

    }
}
