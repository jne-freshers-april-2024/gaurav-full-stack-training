package com.thinkitive.microservice.appointmentservice.repository;

import com.thinkitive.microservice.appointmentservice.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
