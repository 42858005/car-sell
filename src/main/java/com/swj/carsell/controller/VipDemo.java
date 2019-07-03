package com.swj.carsell.controller;

import com.swj.carsell.model.Vip;
import com.swj.carsell.model.VipMuchDetail;

public class VipDemo {
    Vip vip = new Vip();
    VipMuchDetail vipmuch = new VipMuchDetail();

    public String charge(int id,double much,double jlmuch) {
        vipmuch.getMuch(id);
        vipmuch.setMuch(much);
        vipmuch.setJlMuch(jlmuch);
    }
}
