package com.in28minutes.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learn_spring_framework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learn_spring_framework.game.GameRunner;

@SpringBootApplication   // Automatically does a component scan on the current package.
//@ComponentScan("com.in28minutes.spring.learn_spring_framework")
//@ComponentScan({"com.package1", "com.package2"})   // For scanning multiple packages.
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
//		MarioGame game = new MarioGame();  // Create a game.
//		SuperContraGame game = new SuperContraGame();
		
		// How can we use Spring framework to create these instead? Line 19 creates these for us.
		// Spring is managing the creation of these objects. When Spring manages the creation of objects and creates instances of them, we call them beans.
		// Spring manages all our beans.
//		GamingConsole game = new MarioGame();  // 1
//		GameRunner runner = new GameRunner(game);  // 2 Pass it to the game runner.
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		// An instance of a component is a bean. What bean do we want? We want an instance of the GameRunner class.
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();  // Game runner will be able to run the game.
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());

		 
	}

}
