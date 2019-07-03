package com.swj.carsell.controller;

import com.swj.carsell.model.Admin;
import com.swj.carsell.model.AjaxObj;
import com.swj.carsell.service.AdminService;
import com.swj.carsell.utils.ReturnValCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public AjaxObj login(@RequestBody Admin admin, HttpSession httpSession){

        Admin loginAdmin = adminService.login(admin);

        if (loginAdmin == null) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "登录失败，请检查用户名密码是否正确");
        }
        httpSession.setAttribute("admin", loginAdmin);

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "登录成功", loginAdmin);
    }

    @PostMapping("/updateInfos")
    public AjaxObj updateInfos(@RequestBody Admin admin){

        int isOk = adminService.updateInfo(admin);

        if (isOk > 0) {
            return new AjaxObj(ReturnValCode.RTN_VAL_CODE_SUCCESS, "修改成功");
        }

        return new AjaxObj(ReturnValCode.RTN_VAL_CODE_FAIL, "修改失败");
    }
}
