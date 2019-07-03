package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.VipLevelMapper;
import com.swj.carsell.model.VipLevel;
import com.swj.carsell.service.VipLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipLevelServiceImpl implements VipLevelService {
    @Autowired

    private VipLevelMapper vipLevelMapper;

    @Override
    public int addVipLevel(VipLevel vipLevel)
    {
        return vipLevelMapper.insertSelective(vipLevel);
    }

    @Override
    public int updateVipLevel(VipLevel vipLevel)
    {
        return vipLevelMapper.updateByPrimaryKeySelective(vipLevel);
    }

}
