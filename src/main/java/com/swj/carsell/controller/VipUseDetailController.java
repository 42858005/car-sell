package com.swj.carsell.controller;

import com.swj.carsell.annotation.UserLoginToken;
import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.model.VipUseDetail;
import com.swj.carsell.model.Xm;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.service.XmService;
import com.swj.carsell.utils.ReturnValCode;
import com.swj.carsell.vo.VipConsumeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
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

    /**
     * 查询消费记录
     */
    @GetMapping("/selectConsumeDetail")
    @UserLoginToken
    public String selectConsumeDetail(Model model) {
        model.addAttribute("list", vipUseDetailService.selectConsumeDetail());
        return "vipusedetail";
    }

//    @PostMapping("/selectFromIndex")
//    @UserLoginToken
//    public ModelAndView selectFromIndex() {
//        ModelAndView mav = new ModelAndView();
//        List<VipConsumeVo> list = vipUseDetailService.selectFromIndex();
//        mav.addObject("list", list);
//        mav.setViewName("vipindex");
//        return mav;
//    }
}