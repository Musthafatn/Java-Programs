package com.scg.exception;


//			ArrayIndexOutOfBoundsException
//			ArithmeticException
//			NullPointerException
//			NumberFormatException


public class MultipleCatch {

//	private static String str;

	public static void main(String[] args) {
		
		try {
			
			int arr[]=new int[5];
			arr[0]=50/0;
			
//			System.out.println(arr[7]);
//			
//			str = null;
//			System.out.println(str.length());
//			
//			str="string";
//			int num=Integer.parseInt(str);
//			System.out.println(num);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		catch (NullPointerException e) {
			System.out.println(e);
		}
		
		catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}
