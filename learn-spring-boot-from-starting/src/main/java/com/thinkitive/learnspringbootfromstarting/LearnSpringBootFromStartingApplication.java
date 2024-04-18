package com.thinkitive.learnspringbootfromstarting;

import com.thinkitive.learnspringbootfromstarting.bean.MyBeanClass;
import com.thinkitive.learnspringbootfromstarting.lazy.eager.Lazy;
import com.thinkitive.learnspringbootfromstarting.project.controller.CompControl;
import com.thinkitive.learnspringbootfromstarting.project.controller.MyController;
import com.thinkitive.learnspringbootfromstarting.project.repository.MyRepository;
import com.thinkitive.learnspringbootfromstarting.project.service.MyService;
import com.thinkitive.learnspringbootfromstarting.value.DefaultCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootFromStartingApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootFromStartingApplication.class, args);
		Syudent s = context.getBean(Syudent.class);
		s.studentData();

		Syudent s1 = context.getBean(Syudent.class);
		s1.studentData();

		MyBeanClass bean = context.getBean(MyBeanClass.class);
		System.out.println(bean.name());
		System.out.println(bean.calculations());

		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.myContro());

		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.service());

		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.repo());

		Lazy lazy = context.getBean(Lazy.class);
		System.out.println(lazy.dataPresnt());

		DefaultCheck defaultCheck = context.getBean(DefaultCheck.class);
		System.out.println(defaultCheck.getMyLogPrint());

		System.out.println(defaultCheck.getHostName());

		System.out.println(defaultCheck.getGetPostNumber());

		System.out.println(CompControl.class);
	}
}
