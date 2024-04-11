package com.thinkitive.restfulwebservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timeStamop;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timeStamop, String message, String details) {
        this.timeStamop = timeStamop;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimeStamop() {
        return timeStamop;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
