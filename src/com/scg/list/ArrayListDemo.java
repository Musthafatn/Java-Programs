package com.scg.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(2);
		al.add(4);
		al.add(3);
		
//		System.out.println(al.get(0));
//		al.add(2, 10);
//		al.remove(0);
//		al.remove(4);
//		System.out.println(al.get(0));
//		System.out.println(al.size());
		Collections.sort(al);
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println(Collections.binarySearch(al, 7));
//		System.out.println(Collections.frequency(al, 3));
		System.out.println(al);

	}

}
