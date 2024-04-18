package com.thinkitive.learnspringbootfromstarting.project.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String repo(){
        System.out.println("We can write a data base purpose logic inside the repository layer.");
        return "Repositiry Layer";
    }
}
