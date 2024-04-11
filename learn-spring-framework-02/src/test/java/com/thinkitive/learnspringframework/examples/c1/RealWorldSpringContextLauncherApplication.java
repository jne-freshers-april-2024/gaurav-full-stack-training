package com.thinkitive.learnspringframework.examples.c1;

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

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class);){	
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findmax());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}