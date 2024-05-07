package com.thinkitive.microservice.paymentservice.controller;

import com.thinkitive.microservice.paymentservice.entity.Payment;
import com.thinkitive.microservice.paymentservice.service.impl.PaymentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImplementation serviceImplementation;

    @GetMapping("/get/{user_Id}")
    public ResponseEntity<?> getOneData(@PathVariable int user_Id){
        Payment getOne = serviceImplementation.getPaymentWithId(user_Id);
        if(getOne != null){
            return ResponseEntity.ok().body(getOne);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("paymeny not found with id "+ user_Id);
        }
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllPayment(){
        List<Payment> getData = serviceImplementation.getAllDataOfPayment();
        return ResponseEntity.ok().body(getData);
    }

    @PostMapping("/create")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment){
        Payment paymentDone = serviceImplementation.makePayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentDone);
    }

    @PutMapping("/update/{user_Id}")
    public ResponseEntity<?> updatePaymentData(@PathVariable int user_Id) {
        Payment updatePay = serviceImplementation.updatePayment(user_Id);
        if (updatePay != null) {
            return ResponseEntity.ok().body(updatePay);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{user_Id}")
    public ResponseEntity<?> deletePaymentData(@PathVariable int user_Id){
        serviceImplementation.deletePayment(user_Id);
            return ResponseEntity.ok().body("Deleted Successfully");
    }
}