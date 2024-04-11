package com.thinkitive.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.thinkitive.learnspringframework.game.GameRunner;
import com.thinkitive.learnspringframework.game.GamingConsole;
import com.thinkitive.learnspringframework.game.MarioGame;
import com.thinkitive.learnspringframework.game.PacmanGame;
import com.thinkitive.learnspringframework.game.SuperContraGame;

@Component
class YourBusinessClass{
	
	Depedency1 depedency1;
	
	Depedency1 depedency2;
	
	// Constructor Based Approach
//	@Autowired
	public YourBusinessClass(Depedency1 depedency1, Depedency1 depedency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.depedency1 = depedency1;
		this.depedency2 = depedency2;
	}
	
	
	
	// Setter Based Approach
//	@Autowired
//	public void setDepedency1(Depedency1 depedency1) {
//		System.out.println("Setter Injection - setDepedency1");
//		this.depedency1 = depedency1;
//	}
//	
//	@Autowired
//	public void setDepedency2(Depedency1 depedency2) {
//		System.out.println("Setter Injection - setDepedency2");
//		this.depedency2 = depedency2;
//	}
	
	public String toString() {
		return "Using " + depedency1 + " and " + depedency2;
	}
}

@Component
class Depedency1{
	
}

@Component
class Depedency2{
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);){	
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}