package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

//@Component
public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("PacMan up");	
	}
	
	public void down() {
		System.out.println("PacMan down");	
	}
	
	public void right() {
		System.out.println("PacMan right");	
	}
	
	public void left() {
		System.out.println("PacMan left");
		
	}
}
