package com.thinkitive.microservice.appointmentservice.service;

import com.thinkitive.microservice.appointmentservice.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    public Appointment createAppointment(Appointment appointment);
    public Appointment getAppointmentWithID(int appointment_Id);
    public List<Appointment> getAllAppointment();
}
