package com.swj.carsell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swj.carsell.mapper.VipMapper;
import com.swj.carsell.mapper.VipUseDetailMapper;
import com.swj.carsell.mapper.XmMapper;
import com.swj.carsell.model.Vip;
import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.VipService;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.service.XmService;
import com.swj.carsell.vo.VipConsumeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class VipUseDetailServiceImpl implements VipUseDetailService {

    @Autowired
    private VipUseDetailMapper vipUseDetailMapper;
    @Autowired
    private VipService vipService;


    @Override
    public int addVipUseDetail(VipUseDetail vipUseDetail) {
        vipUseDetail.setDetailDate(new Date());

        return vipUseDetailMapper.insertSelective(vipUseDetail);

    }

    @Override
    public int updateUseDetail(VipUseDetail vipUseDetail) {
        return vipUseDetailMapper.updateByPrimaryKey(vipUseDetail);
    }

    @Override
    public List<VipUseDetail> selectByUseDetail(VipUseDetail vipUseDetail) {
        return vipUseDetailMapper.select(vipUseDetail);
    }

    @Override
    public Map<String, Object> selectConsumeDetail(VipUseDetail vipUseDetail, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        PageInfo<VipUseDetail> pageInfo = new PageInfo<>(vipUseDetailMapper.select(vipUseDetail));
        List<VipUseDetail> vipUseDetails = pageInfo.getList();
        List<VipConsumeVo> list = new ArrayList<>();
        for (VipUseDetail vud : vipUseDetails) {
            VipConsumeVo vipConsume = new VipConsumeVo();
            Vip vip = vipService.selectByPrimaryKey(vud.getVipId());
            BeanUtils.copyProperties(vip, vipConsume);
            BeanUtils.copyProperties(vud, vipConsume);
            list.add(vipConsume);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("info", list);
        map.put("totalPage", pageInfo.getPages());
        return map;
    }

    @Override
    public int deleteByPrimaryKey(VipUseDetail vipUseDetail) {
        return vipUseDetailMapper.deleteByPrimaryKey(vipUseDetail);
    }
}