package com.scg.inheritance;

class Car{
	
	String vehicleType="Car";
	
}

class Maruti extends Car{
	
	String brand="Maruti";
	
	void speed() {
		System.out.println("Maximum Speed: 120kmph");
	}
	
}

class Maruti800 extends Maruti{
	
	String model="Maruti 800";
	
	//Method Overriding
	void speed() {
		System.out.println("Maximum Speed: 150kmph");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Maruti800 m=new Maruti800();
		System.out.println("Vehicle Type: "+m.vehicleType);
		System.out.println("Brand: "+m.brand);
		System.out.println("Model: "+m.model);
		m.speed();

	}

}
