package com.thinkitive.learnspringbootfromstarting.lazy.eager;

import org.springframework.stereotype.Component;

@Component
@org.springframework.context.annotation.Lazy
public class Lazy {
    public boolean dataPresnt(){
        System.out.println("Check the student data is present or not!!!");
        return true;
    }
}
