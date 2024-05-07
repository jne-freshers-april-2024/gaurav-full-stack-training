package com.thinkitive.microservice.paymentservice.repository;

import com.thinkitive.microservice.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
