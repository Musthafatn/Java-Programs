package com.scg.exception;

import java.util.Scanner;

class EligibilityException extends Exception{
	
	private static final long serialVersionUID = -4569939002919764835L;

	EligibilityException(String s){
		super(s);
	}
}

public class CustomException {

	public static void main(String[] args) throws EligibilityException{
		
		try {
			
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			sc.close();
			
			if(age<18) {
				throw new EligibilityException("Not Eligible");
			}
			
			System.out.println("Eligible");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
