package com.thinkitive.learnspringbootfromstarting.project.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.invoke.MethodType;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @RequestMapping("/m")
        public String msgShow(){
        return "Greeeting of the day";
        }

        @GetMapping("/get")
    public String getTheData(){
        return "THis gives the data get data";
        }
}
