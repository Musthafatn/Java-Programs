package com.scg.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime now=LocalTime.now();
//		LocalTime newtime=LocalTime.of(10, 55, 30);
		LocalTime newtime=LocalTime.now(ZoneId.of("Asia/Dubai"));
//		LocalTime newtime=LocalTime.now(ZoneId.of("Asia/Kolkata"));
//		LocalTime newtime=now.minusHours(1);
//		LocalTime newtime=now.minusMinutes(10);
//		LocalTime newtime=now.minusSeconds(30);
//		LocalTime newtime=now.plusHours(1);
//		LocalTime newtime=now.plusMinutes(10);
//		LocalTime newtime=now.plusSeconds(30);	
//		LocalTime newtime=now.withHour(10);
//		LocalTime newtime=now.withMinute(25);
//		LocalTime newtime=now.withSecond(30);
//		LocalTime newtime=now.withNano(1);
		
		System.out.println("Curret time:   "+now);
		System.out.println("Modified time: "+newtime);
		
//		System.out.println(now.compareTo(newtime));
//		System.out.println(now.equals(newtime));
//		System.out.println(now.getHour());
//		System.out.println(now.getMinute());
//		System.out.println(now.getSecond());
//		System.out.println(now.getNano());
//		System.out.println(now.isAfter(newtime));
//		System.out.println(now.isBefore(newtime));
//		System.out.println(now.toSecondOfDay());
//		System.out.println(now.toString().substring(0, 2));

	}

}
