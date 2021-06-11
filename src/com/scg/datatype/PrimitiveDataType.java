package com.scg.datatype;

public class PrimitiveDataType {
	
	static byte byteNum=100;   //The byte data type can store whole numbers from -128 to 127. This can be used instead of int.
	static short shortNum=32000;  //The short data type can store whole numbers from -32768 to 32767:
	static int intNum=1000000;  //The int data type can store whole numbers from -2147483648 to 2147483647
	static long longNum=15000000000L;  //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
									   //This is used when int is not large enough to store the value.
								       //Note that you should end the value with an "L":
	static float floatNum=5.5f;  //The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "f"
	static double doubleNum=19.99d; //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":
	static boolean booleanValue=true;  //A boolean data type is declared with the boolean keyword and can only take the values true or false
	static char singleChar='c';  //The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'
	static String stringExample="Hello"; //The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes
	

	public static void main(String[] args) {
		
		System.out.println("Byte Number is : "+byteNum);
		System.out.println("Short Number is : "+shortNum);
		System.out.println("Integer Number is : "+intNum);

		System.out.println("Float Number is : "+floatNum);
		System.out.println("Double Number is : "+doubleNum);
		System.out.println("Boolean value is : "+booleanValue);
		System.out.println("Single Character is : "+singleChar);
		System.out.println("String example is :"+stringExample);

	}

}
