package com.thinkitive.limitsservice.controller;

import com.thinkitive.limitsservice.bean.Limits;
import com.thinkitive.limitsservice.configuration.Configuration;
//import org.springframework.beans.factory.annotation.Autowired(required=true);
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsServiceController {

    @Autowired
    private Configuration configuration;
    @GetMapping("limits")
    public Limits retriveLimit(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
