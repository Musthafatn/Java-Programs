package com.scg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.scg.java8.Actor;
import com.scg.java8.Hero;

public class Java8Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Actor actor=new Hero();
//		actor.act();
//		actor.speak();
//		actor.dance();
		
		
		List<Integer> list=Arrays.asList(10,20,30,40);
		
//		for(int i:list) {
//			System.out.println(i);
//		}
		
//		list.forEach(i->System.out.println(i*10));
		
//		list.forEach(i->System.out.println(i));
		
//		list.forEach(System.out::println);
		
//		int sum=0;
//		for(int i:list) {
//			sum+=i*2;
//		}
//		List<Integer> newList=list.stream().map(i->i+1).collect(Collectors.toList());
		List<Integer> newList=list.stream().filter(i->i%4==0).collect(Collectors.toList());
		System.out.println(newList);
		
//		System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
//		System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
		
//		int sum=0;
//		for(int i:list) {
//			if(i%4==0) {
//				sum+=i*2;
//			}
//		}
//		System.out.println(sum);
		
//		System.out.println(list.stream().filter(i->i%4==0).reduce(0,Integer::sum));
		
//		System.out.println(list.stream()
//		.filter(i->i%7==0)
//		.map(i->i*2)
//		.findFirst());

		
//		System.out.println(list.stream()
//				.filter(i->i%4==0)
//				.map(i->i*2)
//				.findFirst().orElse(0));

	}

}
