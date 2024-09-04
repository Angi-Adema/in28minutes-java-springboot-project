package com.in28minutes.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring.learn_spring_framework.game.GameRunner;
import com.in28minutes.spring.learn_spring_framework.game.MarioGame;
import com.in28minutes.spring.learn_spring_framework.game.PacManGame;
import com.in28minutes.spring.learn_spring_framework.game.SuperContraGame;
import com.in28minutes.spring.learn_spring_framework.game.GamingConsole;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		// SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();  // Create a game.
//		SuperContraGame game = new SuperContraGame();
		
		GamingConsole game = new MarioGame();  // 1
		GameRunner runner = new GameRunner(game);  // 2 Pass it to the game runner.
		
		runner.run();  // Game runner will be able to run the game.
		//asdkjasd
		 
	}

}
