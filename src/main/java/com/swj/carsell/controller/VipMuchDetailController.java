package com.swj.carsell.controller;

import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.model.VipLevel;
import com.swj.carsell.model.VipMuchDetail;
import com.swj.carsell.service.VipLevelService;
import com.swj.carsell.service.VipMuchDetailService;
import com.swj.carsell.utils.ReturnValCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vipMuch")
public class VipMuchDetailController {
    @Autowired
    private VipMuchDetailService vipMuchDetailService;

    @PostMapping("/addVipMuch")
    public AjaxObj addMuchDetail(@RequestBody VipMuchDetail vipMuchDetail) {
        int isOk = vipMuchDetailService.addMuchDetail(vipMuchDetail);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加失败");
    }

    @PostMapping("/updateVipMuch")
    public AjaxObj updateMuchDetail(@RequestBody VipMuchDetail vipMuchDetail) {
        int isOk = vipMuchDetailService.updateMuchDetail(vipMuchDetail);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改失败");
    }


}