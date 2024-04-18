package com.thinkitive.learnspringbootfromstarting;

import org.springframework.stereotype.Component;

@Component("subLab1")
public class SubjectLab {
    private int subId;
    private String subName;

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
    public void compLab(){
        System.out.println("Linux Lab");
    }
}
