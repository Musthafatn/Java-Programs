package com.scg.annotation;

import com.scg.annotation.MultivalueAnnotation;

public class Message
{
    @MultivalueAnnotation
    public void displayHi()
    {
        System.out.println("Hi");
    }
    
}

class MessageSub extends Message{
	
	void print() {
		System.out.println("Inside subclass");
	}
	
}
