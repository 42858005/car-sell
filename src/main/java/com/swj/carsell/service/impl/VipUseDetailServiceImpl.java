package com.swj.carsell.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swj.carsell.annotation.NeedSetFeildValue;
import com.swj.carsell.mapper.VipMapper;
import com.swj.carsell.mapper.VipUseDetailMapper;
import com.swj.carsell.mapper.XmMapper;
import com.swj.carsell.model.Vip;
import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.VipService;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.service.XmService;
import com.swj.carsell.utils.CommonUtil;
import com.swj.carsell.vo.VipConsumeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
        vipUseDetail.setId(CommonUtil.getUUID());
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
    @NeedSetFeildValue
    public List<VipConsumeVo> selectConsumeDetail() {
        Example example = new Example(VipUseDetail.class);
        Example.Criteria criteria = example.createCriteria();
        example.setOrderByClause("detail_date desc");

        List<VipUseDetail> vipUseDetails = vipUseDetailMapper.selectByExample(example);
        List<VipConsumeVo> list = new ArrayList<>();
        for (VipUseDetail vud : vipUseDetails) {
            VipConsumeVo vipConsume = new VipConsumeVo();
            Vip vip = vipService.selectByPrimaryKey(vud.getVipId());
            BeanUtils.copyProperties(vip, vipConsume);
            BeanUtils.copyProperties(vud, vipConsume);
            list.add(vipConsume);
        }
        return list;
    }

    @Override
    public int deleteByPrimaryKey(VipUseDetail vipUseDetail) {
        return vipUseDetailMapper.deleteByPrimaryKey(vipUseDetail);
    }

    @Override
    @NeedSetFeildValue
    public List<VipConsumeVo> selectFromIndex() {
        List<VipUseDetail> vipUseDetails = vipUseDetailMapper.selectFromIndex();
        List<VipConsumeVo> list = new ArrayList<>();
        for (VipUseDetail vud : vipUseDetails) {
            VipConsumeVo vipConsume = new VipConsumeVo();
            Vip vip = vipService.selectByPrimaryKey(vud.getVipId());
            BeanUtils.copyProperties(vip, vipConsume);
            BeanUtils.copyProperties(vud, vipConsume);
            list.add(vipConsume);
        }
        return list;
    }
}