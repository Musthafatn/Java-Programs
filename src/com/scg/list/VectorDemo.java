package com.scg.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(1);
		v.add(2);
		
//		v.add(3);
//		v.add(4);
//		v.add(5);
//		v.add(6);
//		v.add(1);
//		v.add(2);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());

	}

}
