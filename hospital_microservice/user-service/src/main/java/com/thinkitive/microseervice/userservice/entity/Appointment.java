package com.thinkitive.microseervice.userservice.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Builder
public class Appointment {
    private int appointment_Id;
    private LocalDate date;
    private String status;
    private LocalDateTime slot;

    private Payment payment;

    public Appointment() {
    }

    public Appointment(int appointment_Id, LocalDate date, String status, LocalDateTime slot, Payment payment) {
        this.appointment_Id = appointment_Id;
        this.date = date;
        this.status = status;
        this.slot = slot;
        this.payment = payment;
    }

    public int getAppointment_Id() {
        return appointment_Id;
    }

    public void setAppointment_Id(int appointment_Id) {
        this.appointment_Id = appointment_Id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSlot() {
        return slot;
    }

    public void setSlot(LocalDateTime slot) {
        this.slot = slot;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
