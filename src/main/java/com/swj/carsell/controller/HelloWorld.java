package com.swj.carsell.controller;

import com.swj.carsell.annotation.UserLoginToken;
import com.swj.carsell.model.VipLevel;
import com.swj.carsell.service.VipLevelService;
import com.swj.carsell.service.VipUseDetailService;
import com.swj.carsell.utils.CommonUtil;
import com.swj.carsell.vo.VipConsumeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class HelloWorld {
    @Autowired
    private VipUseDetailService vipUseDetailService;
    @Autowired
    private VipLevelService vipLevelService;

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

    @GetMapping("/vipAdd")
    @UserLoginToken
    public String vipAdd(Model model) {
        List<VipLevel> list = vipLevelService.selectByVipLevel(null);

        model.addAttribute("date", CommonUtil.getDate("yyyy-MM-dd HH:mm:ss", new Date()));
        model.addAttribute("levelList", list);
        return "vipadd";
    }
    @GetMapping("/vipUpdate")
    @UserLoginToken
    public String vipUpdate(Model model) {
        return "vipupdate";
    }

}
