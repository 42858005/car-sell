package com.swj.carsell.service.impl;

import com.swj.carsell.mapper.AdminMapper;
import com.swj.carsell.model.Admin;
import com.swj.carsell.service.AdminService;
import com.swj.carsell.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        return adminMapper.selectOne(admin);
    }

    @Override
    public Admin selectByPrimaryKey(String id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateInfo(Admin admin) {
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int addAdmin(Admin admin) {
        admin.setId(CommonUtil.getUUID());
        return adminMapper.insertSelective(admin);
    }

    @Override
    public List<Admin> selectByAdmin(Admin admin) {
        return adminMapper.select(admin);
    }

    @Override
    public int deleteByPrimaryKey(Admin admin) {
        return adminMapper.deleteByPrimaryKey(admin);
    }

}
