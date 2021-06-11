package com.scg;

import com.scg.enumeration.Days;
import com.scg.enumeration.Level;
import com.scg.enumeration.Mobile;

public class EnumController {
	
	//The Enum in Java is a data type which contains a fixed set of constants.
	//According to the Java naming conventions, we should have all constants in capital letters.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ordinal(), valueOf(), values()
		
		Days day=Days.MONDAY;
		day=Days.FRIDAY;
		System.out.println("Today is "+day);
		System.out.println("Index of "+day+": "+day.ordinal());
		System.out.println("Value of MONDAY: "+Days.valueOf("MONDAY"));
		
		System.out.println();
		
		for(Days d:Days.values()) {
			System.out.println(d);
		}
		
		System.out.println();
		
		Level level=Level.LOW;
		switch (level) {
		case LOW:
			System.out.println("Low level");
			break;
			
		case MEDIUM:
			System.out.println("Medium level");
			break;
			
		case HIGH:
			System.out.println("High level");
			break;	

		default:
			System.out.println("No level");
			break;
		}
		
		Mobile oppo=Mobile.OPPO;
		System.out.println(oppo.getPrice());

	}

}
