package com.thinkitive.microseervice.userservice.feignservice;

import com.thinkitive.microseervice.userservice.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PAYMENT-SERVICE")
public interface PaymentService {
    @GetMapping("/payment/get/{user_Id}")
    Payment payment(@PathVariable int user_Id);
}
