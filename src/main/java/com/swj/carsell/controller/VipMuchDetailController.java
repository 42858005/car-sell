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

import java.util.List;


@RestController
@RequestMapping("/vipMuch")
public class VipMuchDetailController {
    @Autowired
    private VipMuchDetailService vipMuchDetailService;

    @PostMapping("/aOrU")
    public AjaxObj aOrU(@RequestBody VipMuchDetail vipMuchDetail) {

        int isOk = 0;
        if (vipMuchDetail.getId() == null) {
            isOk = vipMuchDetailService.addMuchDetail(vipMuchDetail);
        } else {
            isOk = vipMuchDetailService.updateMuchDetail(vipMuchDetail);
        }

        if(isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功");
        }
        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "请求失败");
    }

    /**
     * 根据所传的vipMuchDetail里面的字段值来匹配查询
     * 若查询所有 vipMuchDetail值不传即可
     * @param vipMuchDetail
     * @return
     */
    @PostMapping("/selectByMuchDetail")
    public AjaxObj selectByMuchDetail(@RequestBody VipMuchDetail vipMuchDetail) {

        List<VipMuchDetail> list = vipMuchDetailService.selectByMuchDetail(vipMuchDetail);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功", list);
    }

    @PostMapping("/deleteByMuchDetail")
    public AjaxObj deleteByMuchDetail(@RequestBody VipMuchDetail vipMuchDetail) {

        //主键不能为空，根据主键删除
        if (vipMuchDetail.getId() == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "参数出错");
        }
        //根据主键删除
        int isOk = vipMuchDetailService.deleteByPrimaryKey(vipMuchDetail);

        if (isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "删除成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "删除失败");
    }

}