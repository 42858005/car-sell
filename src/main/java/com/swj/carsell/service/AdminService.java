package com.swj.carsell.service;

import com.swj.carsell.model.Admin;

import java.util.List;

public interface AdminService {

    Admin login(Admin admin);

    Admin selectByPrimaryKey(String id);

    int updateInfo(Admin admin);

    int addAdmin(Admin admin);

    List<Admin> selectByAdmin(Admin admin);

    int deleteByPrimaryKey(Admin admin);
}
