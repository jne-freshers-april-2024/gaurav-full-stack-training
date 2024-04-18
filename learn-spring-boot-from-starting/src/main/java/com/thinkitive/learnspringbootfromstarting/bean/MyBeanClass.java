package com.thinkitive.learnspringbootfromstarting.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanClass {
    @Bean
    public Novel name(){
        return new Novel();
    }

    @Bean
    public int calculations(){
        int number = 12;
        int number2 = 12;
        int result = number + number2;
        return result;
    }
}
