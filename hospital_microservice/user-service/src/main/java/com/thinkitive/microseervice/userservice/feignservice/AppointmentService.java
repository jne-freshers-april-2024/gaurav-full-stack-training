package com.thinkitive.microseervice.userservice.feignservice;

import com.thinkitive.microseervice.userservice.entity.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(name = "APPOINTMENTSERVICE")
public interface AppointmentService {
    @GetMapping("/get/{appointment_Id}")
    public Appointment appointment();


    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody Appointment appointment);
}