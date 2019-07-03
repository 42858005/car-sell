package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.AdminMapper;
import com.swj.carsell.model.Admin;
import com.swj.carsell.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        return adminMapper.selectOne(admin);
    }

    @Override
    public int updateInfo(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

}
