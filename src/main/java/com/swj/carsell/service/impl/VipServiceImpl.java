package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.VipMapper;
import com.swj.carsell.model.Vip;
import com.swj.carsell.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;


    @Override
    public int addVip(Vip vip) {
        vip.setCrDate(new Date());

        return vipMapper.insertSelective(vip);

    }

    @Override
    public int updateVip(Vip vip) {
        //vip.setCrDate(new Date());

        return vipMapper.updateByPrimaryKeySelective(vip);

    }

    @Override
    public List<Vip> selectAll() {
        return vipMapper.selectAll();
    }

    @Override
    public List<Vip> selectByVip(Vip vip) {
        return vipMapper.select(vip);
    }
}
