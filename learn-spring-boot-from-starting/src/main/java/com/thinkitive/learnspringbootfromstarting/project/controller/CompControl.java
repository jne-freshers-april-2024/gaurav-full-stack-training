package com.thinkitive.learnspringbootfromstarting.project.controller;

import com.thinkitive.learnspringbootfromstarting.project.service.HardwareService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompControl {
    @RequestMapping("/data")
    @ResponseBody
    public String nameOfData(){
        return "Searching The Data";
    }

    @RequestMapping("/compData")
    @ResponseBody
    public HardwareService availableSource(){
        HardwareService hardwareService = new HardwareService(1, "SSD", 2509);
        return  hardwareService;
    }

}
