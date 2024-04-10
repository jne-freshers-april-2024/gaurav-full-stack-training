package com.thinkitive.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thinkitive.learnspringframework.game.GameRunner;
import com.thinkitive.learnspringframework.game.GamingConsole;
import com.thinkitive.learnspringframework.game.MarioGame;
import com.thinkitive.learnspringframework.game.PacmanGame;
import com.thinkitive.learnspringframework.game.SuperContraGame;

@Configuration
@ComponentScan("com.thinkitive.learnspringframework.game")
public class GamingAppLauncherApplication {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);){			
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();;
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}