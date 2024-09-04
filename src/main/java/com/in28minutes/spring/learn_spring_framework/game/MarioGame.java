package com.in28minutes.spring.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("jump");	
	}
	
	public void down() {
		System.out.println("down into a hole");	
	}
	
	public void right() {
		System.out.println("accelerate");	
	}
	
	public void left() {
		System.out.println("stop");
		
	}

}
