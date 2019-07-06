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

import java.util.List;


@RestController
@RequestMapping("/vipUse")
public class VipUseDetailController {
    @Autowired
    private VipUseDetailService vipUseDetailService;

    @PostMapping("/aOrU")
    public AjaxObj aOrU(@RequestBody VipUseDetail vipUseDetail) {

        int isOk = 0;
        if (vipUseDetail.getId() == null) {
            isOk = vipUseDetailService.addVipUseDetail(vipUseDetail);
        } else {
            isOk = vipUseDetailService.updateUseDetail(vipUseDetail);
        }


        if (isOk > 0) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "请求失败");
    }


    /**
     * 根据所传的vipUseDetail里面的字段值来匹配查询
     * 若查询所有 vipUseDetail值不传即可
     * @param vipUseDetail
     * @return
     */
    @PostMapping("/selectByUseDetail")
    public AjaxObj selectByUseDetail(@RequestBody VipUseDetail vipUseDetail) {

        List<VipUseDetail> list = vipUseDetailService.selectByUseDetail(vipUseDetail);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功", list);
    }

    @PostMapping("/deleteByUseDetail")
    public AjaxObj deleteByUseDetail(@RequestBody VipUseDetail vipUseDetail) {

        //主键不能为空，根据主键删除
        if (vipUseDetail.getId() == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "参数出错");
        }
        //根据主键删除
        int isOk = vipUseDetailService.deleteByPrimaryKey(vipUseDetail);

        if (isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "删除成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "删除失败");
    }
}