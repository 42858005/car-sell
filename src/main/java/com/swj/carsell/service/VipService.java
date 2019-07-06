package com.swj.carsell.service;

import com.swj.carsell.model.Vip;

import java.util.List;

public interface VipService {
    int addVip(Vip vip);

    int updateVip(Vip vip);

    List<Vip> selectAll();

    List<Vip> selectByVip(Vip vip);

}
