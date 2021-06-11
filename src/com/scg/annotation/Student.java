package com.scg.annotation;

public class Student extends StudentAge {

	
	//  @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
	
	
	/*
      If you remove the @SuppressWarnings("unchecked")
      annotation, it will show warning at compile time
      because we are using non-generic collection.
     */
	
	/* 
	  @Override annotation assures that the subclass method is overriding the parent class method. 
      
	*/
	
	
    @Deprecated(since = "Version 8")
	public void displayName()
	{
		System.out.println("Name: Musthafa");  
	}
    
	// @Deprecated annoation marks that this method is deprecated so compiler prints warning. 
    // It informs user that it may be removed in the future versions.
	// So, it is better not to use such methods.



    @Override
    public void displayAge()
	{
    	System.out.println("Age: 23");
	}
}