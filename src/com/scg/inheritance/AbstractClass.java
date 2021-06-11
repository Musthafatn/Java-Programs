package com.scg.inheritance;

abstract class Bike{
	
	abstract void run();
	
	void speed() {
		System.out.println("Maximum Speed: 180kmph");
	}
	
}

class Ns200 extends Bike{
	
	void run() {
		System.out.println("Running at 120kmph");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Bike ns=new Ns200();
		ns.run();
		ns.speed();
		
	}

}
