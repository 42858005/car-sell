package com.swj.carsell.controller;


import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.model.Vip;

import com.swj.carsell.service.VipService;
import com.swj.carsell.utils.ReturnValCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/vip")
public class VipController {
    @Autowired
    private VipService vipService;

    @PostMapping("/addVip")
    public AjaxObj addVip(@RequestBody Vip vip) {
        int isOk = vipService.addVip(vip);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加失败");
    }

    @PostMapping("/updateVip")
    public AjaxObj updateVip(@RequestBody Vip vip) {
        int isOk = vipService.updateVip(vip);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改失败");
    }

    @PostMapping("/selectAllVip")
    public AjaxObj selectAllVip() {
        //int isOk = vipService.addVip(vip);

//        if(isOk > 0){
//            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加成功");
//        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加失败");
    }

    


}
