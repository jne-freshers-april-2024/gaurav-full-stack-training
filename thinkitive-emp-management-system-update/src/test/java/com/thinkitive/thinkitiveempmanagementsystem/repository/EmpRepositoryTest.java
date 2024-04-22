package com.thinkitive.thinkitiveempmanagementsystem.repository;

import com.thinkitive.thinkitiveempmanagementsystem.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmpRepositoryTest {

    @Autowired
    EmpRepository empRepository;
//    @Test
//    void saveData(){
//        Emp e = new Emp();
//        e.setFirstName("Mayank");
//        e.setLastName("Patil");
//        e.setEmail("mayank@thinkitive.com");
//        e.setDob(LocalDate.of(2002, 5, 11));
//        e.setDepartment("Java Node EHR");
//        e.setDesignation("BackEnd Developer");
//        Emp edataprint = empRepository.save(e);
//        System.out.println(edataprint);
//    }
//    @Test
  /*  void saveAllData(){
        Emp e = new Emp();
        e.setFirstName("Gaurav");
        e.setLastName("Khairnar");
        e.setEmail("gaurav@thinkitive.com");
        e.setDob(LocalDate.of(2001, 4, 1));
        e.setDepartment("Java React");
        e.setDesignation("Full Stack Developer");

        Emp e1 = new Emp();
        e1.setFirstName("Mayank");
        e1.setLastName("Patil");
        e1.setEmail("mayank@thinkitive.com");
        e1.setDob(LocalDate.of(2002, 4, 1));
        e1.setDepartment("MERN");
        e1.setDesignation("MERN Developer");

        Emp e2 = new Emp();
        e2.setFirstName("Ram");
        e2.setLastName("Bandhu");
        e2.setEmail("ram@thinkitive.com");
        e2.setDob(LocalDate.of(1990, 4, 1));
        e2.setDepartment("MongoDb MySql");
        e2.setDesignation("Database Developer");

        empRepository.saveAll(List.of(e, e1, e2));
//        System.out.println(edataprint);
    } */
}