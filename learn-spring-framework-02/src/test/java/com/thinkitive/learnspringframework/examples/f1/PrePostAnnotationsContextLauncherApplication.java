package com.thinkitive.learnspringframework.examples.f1;

import java.util.Arrays;

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

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDepedency someDepedency;

	public SomeClass(SomeDepedency someDepedency) {
		this.someDepedency = someDepedency;
		System.out.println("All depedencies are ready");
	}
	 
	@PostConstruct
	public void initialize() {
		someDepedency.getReady();
	}
	
	@PreDestroy
	public void cleanup(){
		System.out.println("Cleanup");
	}
}

@Component
class SomeDepedency{
	public void getReady() {
		System.out.println("Some Logic using SomeDependency");
	}
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(SomeClass.class));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}