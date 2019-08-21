package com.swj.carsell.mapper;


import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.utils.MyMapper;

import java.util.List;

public interface VipUseDetailMapper extends MyMapper<VipUseDetail> {

    List<VipUseDetail> selectFromIndex();
}