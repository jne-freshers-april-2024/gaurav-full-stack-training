package com.thinkitive.springbootjpadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaDataApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringbootJpaDataApplication.class, args);
//		context.getBean(ManageControl.class);
	}

}
