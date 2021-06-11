package com.scg.exception;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		if(num<10) {
			throw new ArithmeticException("Too low value");
		}
		
		else if (num>100) {
			throw new ArithmeticException("Too high value");
		}
		
		else {
			System.out.println("success");
		}

	}

}
