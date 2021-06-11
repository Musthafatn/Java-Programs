package com.scg.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.addFirst(10);
//		
		ll.addLast(20);
//		
		ll.remove(0);
		ll.removeFirst();
		ll.removeLast();
////		
		ll.clear();
//		
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
//		System.out.println(ll);
		
		

	}

}
