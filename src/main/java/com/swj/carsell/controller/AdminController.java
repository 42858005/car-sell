package com.swj.carsell.controller;

import com.swj.carsell.annotation.UserLoginToken;
import com.swj.carsell.model.Admin;
import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.service.AdminService;
import com.swj.carsell.utils.ReturnValCode;
import com.swj.carsell.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public AjaxObj login(@RequestBody Admin admin, HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();
        Admin loginAdmin = adminService.login(admin);

        if (loginAdmin == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "登录失败，请检查用户名密码是否正确");
        }
        String token = TokenUtil.getToken(loginAdmin);
        map.put("token", token);
        map.put("admin", loginAdmin);

        request.getSession().setAttribute("token", token);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "登录成功", map, "/car-sell/vipIndex");
    }

    @PostMapping("/aOrU")
    public AjaxObj updateInfos(@RequestBody Admin admin){

        int isOk = 0;
        if (admin.getId() == null) {
            isOk = adminService.addAdmin(admin);
        } else {
            isOk = adminService.updateInfo(admin);
        }

        if (isOk > 0) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "请求失败");
    }

    /**
     * 根据所传的admin里面的字段值来匹配查询
     * 若查询所有 admin值不传即可
     * @param admin
     * @return
     */
    @PostMapping("/selectByAdmin")
    @UserLoginToken
    public AjaxObj selectByAdmin(@RequestBody Admin admin) {

        List<Admin> list = adminService.selectByAdmin(admin);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "请求成功", list);
    }

    @PostMapping("/deleteByAdmin")
    public AjaxObj deleteByAdmin(@RequestBody Admin admin) {

        //主键不能为空，根据主键删除
        if (admin.getId() == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "参数出错");
        }
        //根据主键删除
        int isOk = adminService.deleteByPrimaryKey(admin);

        if (isOk > 0){
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "删除成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "删除失败");
    }
}
