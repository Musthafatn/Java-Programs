package com.scg.exception;

public class NestedTry {

	public static void main(String[] args) {
		
		try {
			
//			System.out.println(5/0);
			
			try {
				
				int arr[]=new int[5];
				System.out.println(arr[10]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
