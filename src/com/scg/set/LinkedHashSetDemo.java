package com.scg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set1=new LinkedHashSet<Integer>();
		
		set1.add(3);
		set1.add(4);
		set1.add(7);
		set1.add(2);
		set1.add(5);
		
		System.out.println(set1);
		
		Set<Integer> set2=new LinkedHashSet<Integer>();
		
		set2.add(10);
		set2.add(13);
		set2.add(15);
		set2.add(8);
		set2.add(3);
		set2.add(4);
		
		System.out.println(set2);
		
//		set1.addAll(set2);  //Union
//		set1.retainAll(set2); //Intersection
//		set1.removeAll(set2);  //Difference
		
		System.out.println(set1);
		

	}

}
