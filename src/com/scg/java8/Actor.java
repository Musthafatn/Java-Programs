package com.scg.java8;

public interface Actor {
	
	void act();
	void speak();
	default void dance() {
		System.out.println("I can dance");
	}

}
