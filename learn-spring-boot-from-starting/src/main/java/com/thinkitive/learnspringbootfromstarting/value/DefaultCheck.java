package com.thinkitive.learnspringbootfromstarting.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultCheck {
    @Value("My Deafult")
    private String myLogPrint;

    public String getMyLogPrint() {
        return myLogPrint;
    }

    @Value("${my.host}")
    private String hostName;

    public String getHostName() {
        return hostName;
    }

    @Value("${my.port}")
    private String getPostNumber;

    public String getGetPostNumber() {
        return getPostNumber;
    }
}
