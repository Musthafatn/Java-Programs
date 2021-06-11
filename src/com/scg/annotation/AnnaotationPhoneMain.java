package com.scg.annotation;

import java.lang.annotation.Annotation;

public class AnnaotationPhoneMain {

	public static void main(String[] args) {
		
		NokiaSeries obj = new NokiaSeries("Fire",5);
		System.out.println(obj.model);
		System.out.println(obj.size);
		
		Class<? extends NokiaSeries> c = obj.getClass();
		Annotation an = c.getAnnotation(Smartphone.class);
		Smartphone s=(Smartphone)an;
		System.out.println();
		System.out.println(s.os());
		System.out.println(s.version());

	}

}