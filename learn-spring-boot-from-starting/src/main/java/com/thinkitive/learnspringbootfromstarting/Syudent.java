package com.thinkitive.learnspringbootfromstarting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Syudent {
    private int id;
    private String name;
    private String division;
    @Autowired
    @Qualifier("subLab1")
    private SubjectLab subjectLab;

    public Syudent() {
        System.out.println("Hello Student Class");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public SubjectLab getSubjectLab() {
        return subjectLab;
    }

    public void setSubjectLab(SubjectLab subjectLab) {
        this.subjectLab = subjectLab;
    }

    public void studentData(){
        System.out.println("All Students data is stored in database");
        subjectLab.compLab();
    }
}
