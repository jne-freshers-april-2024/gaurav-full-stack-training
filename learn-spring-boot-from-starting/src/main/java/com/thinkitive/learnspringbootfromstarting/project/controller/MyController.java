package com.thinkitive.learnspringbootfromstarting.project.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String myContro(){
        System.out.println("to handle the http requets for that purpose we have used controller annotaton.");
        return "Controller";
    }
}
