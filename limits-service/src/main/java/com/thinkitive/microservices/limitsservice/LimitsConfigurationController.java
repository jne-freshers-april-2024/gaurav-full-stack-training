package com.thinkitive.microservices.limitsservice;

import com.thinkitive.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("limits")
    public LimitConfiguration retriveLimitFromConfiguration(){
        return new LimitConfiguration( configuration.getMaximum(), configuration.getMinimum());
    }
}
