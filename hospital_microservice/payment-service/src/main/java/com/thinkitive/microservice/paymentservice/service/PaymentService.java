package com.thinkitive.microservice.paymentservice.service;

import com.thinkitive.microservice.paymentservice.entity.Payment;

import java.util.List;

public interface PaymentService {
    public Payment getPaymentWithId(int user_Id);
    public Payment makePayment(Payment payment);
    public List<Payment> getAllDataOfPayment();
    public Payment updatePayment(int user_Id);
    public void deletePayment(int user_Id);
}
