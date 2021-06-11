package com.scg.exception;




//		try
//		catch
//		finally
//		throw
//		throws
		

public class TryFinally {

	public static void main(String[] args) {
		
		try {
			
			int numerator=10,denominator=0;
			int result=numerator/denominator;
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			
			System.out.println("Finally Block");
		}

	}

}
