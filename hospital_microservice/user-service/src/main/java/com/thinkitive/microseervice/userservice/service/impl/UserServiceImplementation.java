package com.thinkitive.microseervice.userservice.service.impl;

import com.thinkitive.microseervice.userservice.entity.Appointment;
import com.thinkitive.microseervice.userservice.entity.Payment;
import com.thinkitive.microseervice.userservice.entity.User;
import com.thinkitive.microseervice.userservice.feignservice.PaymentService;
import com.thinkitive.microseervice.userservice.repository.UserRepository;
import com.thinkitive.microseervice.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PaymentService paymentService;

    private Logger logger = LoggerFactory.getLogger(UserServiceImplementation.class);

    @Override
    public User create(User user) {
        User createUser = repository.save(user);
        return createUser;
    }

    @Override
    public User getUser(int user_Id) {
        User user = repository.findById(user_Id).orElse(null);
        Appointment appointuser = restTemplate.getForObject("http://APPOINTMENTSERVICE/appointment/user/get/"+user.getUser_Id(), Appointment.class);
        logger.info("{} ",appointuser);
        List<Appointment> aptment = Arrays.stream(new Appointment[]{appointuser}).toList();

        List<Appointment> appointmentList = aptment.stream().map(appointment -> {

//            System.out.println(appointment.getAppointment_Id());
//            ResponseEntity<Payment> forAppoint = restTemplate.getForEntity("http://PAYMENT-SERVICE/payment/get/"+ appointment.getAppointment_Id(), Payment.class);
              Payment payment = paymentService.payment(appointment.getAppointment_Id());

            appointment.setPayment(payment);
            return appointment;
        }).collect(Collectors.toList());
        user.setAppointments(appointmentList);
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> allUser = repository.findAll();
        return allUser;
    }
}