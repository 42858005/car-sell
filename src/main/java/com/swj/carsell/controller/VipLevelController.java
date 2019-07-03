package com.swj.carsell.controller;


import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.model.VipLevel;
import com.swj.carsell.service.VipLevelService;
import com.swj.carsell.utils.ReturnValCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vipLevel")
public class VipLevelController {
    @Autowired
    private VipLevelService vipLevelService;
    @PostMapping("/addVipLevel")
    public AjaxObj addVipLevel(@RequestBody VipLevel vipLevel) {
        int isOk = vipLevelService.addVipLevel(vipLevel);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "添加失败");
    }

    @PostMapping("/updateVipLevel")
    public AjaxObj updateVipLevel(@RequestBody VipLevel vipLevel) {
        int isOk = vipLevelService.updateVipLevel(vipLevel);

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改失败");
    }


}
