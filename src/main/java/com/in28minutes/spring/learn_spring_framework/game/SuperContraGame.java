package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component  // If all the games have active Component at once, will get error. Here we state this game is primary to eliminate error.
@Primary  // Use Primary to define what you want to autowire.
public class SuperContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("SuperContraGame up");	
	}
	
	public void down() {
		System.out.println("SuperContraGame down");	
	}
	
	public void right() {
		System.out.println("SuperContraGame right");	
	}
	
	public void left() {
		System.out.println("SuperContraGame left");
		
	}

}
