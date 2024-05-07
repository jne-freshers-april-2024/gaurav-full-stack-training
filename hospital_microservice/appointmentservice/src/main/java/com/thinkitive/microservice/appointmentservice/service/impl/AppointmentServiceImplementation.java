package com.thinkitive.microservice.appointmentservice.service.impl;

import com.thinkitive.microservice.appointmentservice.entity.Appointment;
import com.thinkitive.microservice.appointmentservice.repository.AppointmentRepository;
import com.thinkitive.microservice.appointmentservice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService {

    @Autowired
    private AppointmentRepository appoinrmentRepository;
    @Override
    public Appointment createAppointment(Appointment appointment) {
        Appointment createApoointment = appoinrmentRepository.save(appointment);
        return createApoointment;
    }

    @Override
    public Appointment getAppointmentWithID(int appointment_Id) {
        Appointment getAppointmentId = appoinrmentRepository.findById(appointment_Id).get();
        return getAppointmentId;
    }

    @Override
    public List<Appointment> getAllAppointment() {
        List<Appointment> allAppointmentList = appoinrmentRepository.findAll();
        return allAppointmentList;
    }
}
