package com.scg.datatype;

public class Parsing {

	public static void main(String[] args) {
		
		//Parsing is to read the value of one object to convert it to another type
		
		int parse1 = Integer.parseInt("20");
		
        int parse2 = Integer.parseInt("+20");
        int parse3 = Integer.parseInt("-20");
    
        
        /* If we want to convert the string to integer without using parseInt(), we can use valueOf() method
         * 
         *  valueOf() uses parseInt() internally to convert to integer. */
        
        int valueof1 = Integer.valueOf("20");
        
        
       
        //To convert integer to string we use Integer.toString(int);
        
        String string1=Integer.toString(parse1);
        String string2=Integer.toHexString(parse2);
        
        System.out.println("String to integer conversion");
        System.out.print("20+55= ");
        System.out.println(parse1+55); 
        System.out.println(parse2);
        System.out.println(parse3); 
      
        
        System.out.println(valueof1);
        
        System.out.println("Integer to string Conversion");
        System.out.println("20+55= "+string1+55); 
        System.out.println(string2);

	}

}
