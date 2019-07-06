package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.XmMapper;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.XmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmServiceImpl implements XmService {

    @Autowired
    private XmMapper xmMapper;


    @Override
    public int addXm(Xm xm) {
        //vip.setCrDate(new Date());

        return xmMapper.insertSelective(xm);

    }

    @Override
    public int updateXm(Xm xm) {
        //vip.setCrDate(new Date());

        return xmMapper.updateByPrimaryKeySelective(xm);

    }

    @Override
    public List<Xm> selectByXm(Xm xm) {
        return xmMapper.select(xm);
    }

    @Override
    public int deleteByPrimaryKey(Xm xm) {
        return xmMapper.deleteByPrimaryKey(xm);
    }

}