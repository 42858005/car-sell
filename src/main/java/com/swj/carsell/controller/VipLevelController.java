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

import java.util.List;

@RestController
@RequestMapping("/vipLevel")
public class VipLevelController {
    @Autowired
    private VipLevelService vipLevelService;
    @PostMapping("/aOrU")
    public AjaxObj aOrU(@RequestBody VipLevel vipLevel) {

        int isOk = 0;
        if (vipLevel.getId() == null) {
            isOk = vipLevelService.addVipLevel(vipLevel);
        } else {
            isOk = vipLevelService.updateVipLevel(vipLevel);
        }


        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "请求失败");
    }

    /**
     * 根据所传的vipLevel里面的字段值来匹配查询
     * 若查询所有 vipLevel值不传即可
     * @param vipLevel
     * @return
     */
    @PostMapping("/selectByVipLevel")
    public AjaxObj selectByVipLevel(@RequestBody VipLevel vipLevel) {

        List<VipLevel> list = vipLevelService.selectByVipLevel(vipLevel);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功", list);
    }

    @PostMapping("/deleteByVipLevel")
    public AjaxObj deleteByVipLevel(@RequestBody VipLevel vipLevel) {

        //主键不能为空，根据主键删除
        if (vipLevel.getId() == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "参数出错");
        }
        //根据主键删除
        int isOk = vipLevelService.deleteByPrimaryKey(vipLevel);

        if (isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "删除成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "删除失败");
    }

}
