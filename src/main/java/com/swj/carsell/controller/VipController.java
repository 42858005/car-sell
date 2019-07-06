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
import java.util.List;

@RestController
@RequestMapping("/vip")
public class VipController {
    @Autowired
    private VipService vipService;

    @PostMapping("/aOrU")
    public AjaxObj aOrU(@RequestBody Vip vip) {

        int isOk = 0;
        if (vip.getId() == null) {
            //id为空 说明是新增操作
            isOk = vipService.addVip(vip);
        } else {
            //id不为空则是修改操作，根据id修改
            isOk = vipService.updateVip(vip);
        }

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "请求失败");
    }

    /**
     * 根据所传的vip里面的字段值来匹配查询
     * 若查询所有 vip值不传即可
     * @param vip
     * @return
     */
    @PostMapping("/selectByVip")
    public AjaxObj selectByVip(@RequestBody Vip vip) {

        List<Vip> list = vipService.selectByVip(vip);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功", list);
    }

    @PostMapping("/deleteByVip")
    public AjaxObj deleteByVip(@RequestBody Vip vip) {

        //主键不能为空，根据主键删除
        if (vip.getId() == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "参数出错");
        }
        //根据主键删除
        int isOk = vipService.deleteByPrimaryKey(vip);

        if (isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "删除成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "删除失败");
    }


}
