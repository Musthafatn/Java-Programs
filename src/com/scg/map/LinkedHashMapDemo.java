package com.scg.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		
		lhm.put(10, "Ajay");
		lhm.put(15, "Gokul");
		lhm.put(12, "Chinju");
		lhm.put(20, "Akshay");
		
		System.out.println(lhm);

	}

}
