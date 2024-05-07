package com.thinkitive.microseervice.userservice;

import com.thinkitive.microseervice.userservice.entity.Appointment;
import com.thinkitive.microseervice.userservice.feignservice.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private AppointmentService appointmentService;

	@Test
	void contextLoads() {
	}

//	@Test
//	void createAppointment(){
//		Appointment appointmentCreate = new Appointment(11,2024-05-03,"scheduled",2024-05-03T10:00:00);
//		appointmentService.createAppointment(appointmentCreate);
//	}
}