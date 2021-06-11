package com.scg.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(10, "Ajay");
		hm.put(15, "Gokul");
		hm.put(12, "Chinju");
		hm.put(20, null);
		
		Map<Integer, String> hm2=new HashMap<Integer, String>();
		
		hm2.put(100, "Ajay");
		hm2.put(105, "Gokul");
		hm2.put(102, "Chinju");
		
//		hm.putAll(hm2);
//		hm.putIfAbsent(10, "Akshay");
//		hm.remove(10);
//		hm.remove(10, "Ajay");
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		hm.clear();
//		System.out.println(hm.containsKey(10));
//		System.out.println(hm.containsValue("Ajay"));
//		System.out.println(hm.get(20));
//		System.out.println(hm.isEmpty());
//		hm.replace(20, "Vishnu");
//		hm.replace(20, null, "Vishnu");
//		System.out.println(hm.size());
//		System.out.println(hm);
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}

	}

}
