package com.thinkitive.microservice.paymentservice.service.impl;

import com.thinkitive.microservice.paymentservice.entity.Payment;
import com.thinkitive.microservice.paymentservice.repository.PaymentRepository;
import com.thinkitive.microservice.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentService {

    @Autowired
    private PaymentRepository repository;

    @Override
    public Payment getPaymentWithId(int user_Id) {
        Payment paymentOneId = repository.findById(user_Id).get();
        return paymentOneId;
    }

    @Override
    public Payment makePayment(Payment payment) {
        Payment paymentConfirm = repository.save(payment);
        return paymentConfirm;
    }

    @Override
    public List<Payment> getAllDataOfPayment() {
        List<Payment> getAppPayment = repository.findAll();
        return getAppPayment;
    }

    @Override
    public Payment updatePayment(int user_Id) {
        Payment update = repository.findById(user_Id).get();
        Payment status = repository.save(update);
        return status;
    }

    @Override
    public void deletePayment(int user_Id) {
        Payment deleteID = repository.findById(user_Id).get();
        repository.delete(deleteID);
    }
}