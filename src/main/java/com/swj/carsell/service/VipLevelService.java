package com.swj.carsell.service;

import com.swj.carsell.model.VipLevel;

import java.util.List;

public interface VipLevelService {
    int addVipLevel(VipLevel vipLevel);

    int updateVipLevel(VipLevel vipLevel);

    List<VipLevel> selectByVipLevel(VipLevel vipLevel);

    int deleteByPrimaryKey(VipLevel vipLevel);
}
