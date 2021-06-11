package com.scg.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hs1=new HashSet<Integer>();
		
		hs1.add(3);
		hs1.add(4);
		hs1.add(7);
		hs1.add(2);
		hs1.add(5);
		
		Set<Integer> hs2=new HashSet<Integer>();
		
		hs2.add(3);
		hs2.add(4);
		
//		hs1.clear();
//		hs1.remove(3);
//		hs1.removeAll(hs2);
		System.out.println(hs1);
//		System.out.println(hs1.size());
//		System.out.println(hs1.containsAll(hs2));
//		System.out.println(hs1.contains(3));
//		System.out.println(hs1.hashCode());
//		System.out.println(hs1.isEmpty());
		

	}

}
