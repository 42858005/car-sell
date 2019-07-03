package com.swj.carsell.controller;

import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.model.VipLevel;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.VipLevelService;
import com.swj.carsell.service.XmService;
import com.swj.carsell.utils.ReturnValCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/xm")
public class XmController {
    @Autowired
    private XmService xmService;
    @PostMapping("/addXm")
    public AjaxObj addXm(@RequestBody Xm xm) {
        int isOk = xmService.addXm(xm);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加失败");
    }

    @PostMapping("/updateXm")
    public AjaxObj updateXm(@RequestBody Xm xm) {
        int isOk = xmService.updateXm(xm);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改失败");
    }


}