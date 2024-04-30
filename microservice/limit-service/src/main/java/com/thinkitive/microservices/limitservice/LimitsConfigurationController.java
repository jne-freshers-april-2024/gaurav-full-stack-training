package com.thinkitive.microservices.limitservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thinkitive.microservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;
    @GetMapping("limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("/fault-tolerance/example")
    @HystrixCommand(fallbackMethod = "fallbackretirveConfiguration")
    public LimitConfiguration retrieveConfiguration(){
        throw new RuntimeException("Not Available");
    }
    public LimitConfiguration fallbackretirveConfiguration(){
        return new LimitConfiguration(999, 9);
    }
}
