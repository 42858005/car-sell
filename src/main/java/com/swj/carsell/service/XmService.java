package com.swj.carsell.service;

import com.swj.carsell.model.Xm;

import java.util.List;

public interface XmService {
    int addXm (Xm xm);

    int updateXm (Xm xm);

    List<Xm> selectByXm(Xm xm);

    int deleteByPrimaryKey(Xm xm);
}
