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

import java.util.List;


@RestController
@RequestMapping("/xm")
public class XmController {
    @Autowired
    private XmService xmService;
    @PostMapping("/aOrU")
    public AjaxObj aOrU(@RequestBody Xm xm) {

        int isOk = 0;
        if (xm.getId() == null) {
            isOk = xmService.addXm(xm);
        } else {
            isOk = xmService.updateXm(xm);
        }

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "请求失败");
    }

    /**
     * 根据所传的xm里面的字段值来匹配查询
     * 若查询所有 xm值不传即可
     * @param xm
     * @return
     */
    @PostMapping("/selectByXm")
    public AjaxObj selectByXm(@RequestBody Xm xm) {

        List<Xm> list = xmService.selectByXm(xm);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功", list);
    }

    @PostMapping("/deleteByXm")
    public AjaxObj deleteByXm(@RequestBody Xm xm) {

        //主键不能为空，根据主键删除
        if (xm.getId() == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "参数出错");
        }
        //根据主键删除
        int isOk = xmService.deleteByPrimaryKey(xm);

        if (isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "删除成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "删除失败");
    }

}