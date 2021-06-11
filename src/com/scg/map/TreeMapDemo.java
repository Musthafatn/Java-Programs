package com.scg.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		Map<Integer, String> tm=new TreeMap<Integer, String>();
		
		tm.put(10, "Ajay");
		tm.put(15, "Gokul");
		tm.put(12, "Chinju");
		tm.put(20, "Akshay");
		
		System.out.println(tm);

	}

}
