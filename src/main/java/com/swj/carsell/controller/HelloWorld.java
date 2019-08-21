package com.swj.carsell.controller;

import com.swj.carsell.annotation.UserLoginToken;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.vo.VipConsumeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloWorld {
    @Autowired
    private VipUseDetailService vipUseDetailService;

    @GetMapping("/vlogin")
    public String vlogin() {
        return "viplogin";
    }

    @GetMapping("/vipIndex")
    @UserLoginToken
    public String vipIndex(Model model) {
        List<VipConsumeVo> list = vipUseDetailService.selectFromIndex();
        model.addAttribute("list", list);
        return "vipindex";
    }
}
