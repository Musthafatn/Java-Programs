package com.scg.exception;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			
			int numerator=10,denominator=0;
			int result=numerator/denominator;
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			
			System.out.println(e);
			
		}

	}

}
