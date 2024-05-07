package com.thinkitive.microservice.appointmentservice.controller;

import com.thinkitive.microservice.appointmentservice.entity.Appointment;
import com.thinkitive.microservice.appointmentservice.service.impl.AppointmentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentServiceImplementation implementation;

    @GetMapping("/user/get/{appointment_Id}")
    public Appointment getOneAppointment(@PathVariable int appointment_Id){
        Appointment appointmentOne = implementation.getAppointmentWithID(appointment_Id);
        return appointmentOne;
    }

    @GetMapping("/getall")
    public List<Appointment> getAllAppointment(){
        List<Appointment> getAllAppointmentData = implementation.getAllAppointment();
        return getAllAppointmentData;
    }

    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        Appointment createAppoinment = implementation.createAppointment(appointment);
        return createAppoinment;
    }
}