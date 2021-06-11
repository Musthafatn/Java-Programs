package com.scg.datatype;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
		//Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, 
		//where primitive types cannot be used (the list can only store objects)
		
		int primitiveType=5; //primitive type
		Integer objectType=Integer.valueOf(primitiveType);  
		//Putting primitive value inside an object is called boxing as shown above;
		Integer objectType2=primitiveType;  //AutoBoxing - Boxing automatically doing by the java compiler is called autoboxing;
		
		int j=objectType2.intValue();   //UnBoxing - fetching the integer value of the object.
										//Getting primitive value from the object is called unboxing;
		int jj=objectType2; // AutoUnboxing - UnBoxing done automatically by the compiler;
		
		ArrayList<Integer> values =new ArrayList<Integer>(); //Array list can only store objects. 
													
		values.add(10);  //AutoBoxing is performed
		values.add(12);
		System.out.println("Boxing");
		System.out.println("PrimitiveType = "+primitiveType);
		System.out.println("ObjectType = "+objectType);
		System.out.println("ObjectType2 = "+objectType2);
		System.out.println("Unboxing");
		System.out.println("j = "+j);
		System.out.println("jj = "+jj);
		System.out.println("List is "+values);

	}

}
