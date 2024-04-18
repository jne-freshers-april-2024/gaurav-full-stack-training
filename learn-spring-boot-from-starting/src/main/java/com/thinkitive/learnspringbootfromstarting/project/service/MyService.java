package com.thinkitive.learnspringbootfromstarting.project.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String service(){
        System.out.println("All business logic we can write here");
        return "Service Layer";
    }
}
