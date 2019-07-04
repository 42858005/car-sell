package com.swj.carsell.controller;

import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.service.XmService;
import com.swj.carsell.utils.ReturnValCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vipUse")
public class VipUseDetailController {
    @Autowired
    private VipUseDetailService vipUseDetailService;

    @PostMapping("/addVipUse")
    public AjaxObj addVipUse(@RequestBody VipUseDetail vipUseDetail) {
        int isOk = vipUseDetailService.addVipUseDetail(vipUseDetail);

        if (isOk > 0) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加失败");
    }
}