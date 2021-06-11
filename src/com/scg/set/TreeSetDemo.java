package com.scg.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> ts=new TreeSet<Integer>();
		
		ts.add(3);
		ts.add(4);
		ts.add(7);
		ts.add(2);
		ts.add(5);
		
		System.out.println(ts);

	}

}
