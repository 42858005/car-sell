package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.AdminMapper;
import com.swj.carsell.mapper.VipMapper;
import com.swj.carsell.model.Admin;
import com.swj.carsell.model.Vip;
import com.swj.carsell.service.AdminService;
import com.swj.carsell.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;


    @Override
    public int addVip(Vip vip) {
        vip.setCrDate(new Date());

        return vipMapper.insertSelective(vip);

    }
}
