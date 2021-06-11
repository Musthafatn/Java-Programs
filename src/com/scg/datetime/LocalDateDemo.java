package com.scg.datetime;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		LocalDate newdate=LocalDate.of(2000, 12, 31);
		
//		LocalDate newdate=today.minusDays(100);
//		LocalDate newdate=today.plusDays(1);
//		LocalDate newdate=today.minusMonths(1);
//		LocalDate newdate=today.minusWeeks(1);
//		LocalDate newdate=today.minusYears(1);
//		LocalDate newdate=today.plusMonths(1);
//		LocalDate newdate=today.plusWeeks(1);
//		LocalDate newdate=today.plusYears(1);
//		LocalDate newdate=today.withDayOfMonth(30);
//		LocalDate newdate=today.withMonth(12);
//		LocalDate newdate=today.withYear(2000);
				
		System.out.println("Today:    "+today);
		System.out.println("New Date: "+newdate);
		
//		System.out.println(today.compareTo(newdate));
//		System.out.println(today.getDayOfMonth());
//		System.out.println(today.getDayOfYear());
//		System.out.println(today.getMonthValue());
//		System.out.println(today.getYear());
//		System.out.println(today.isAfter(newdate));
//		System.out.println(today.isBefore(newdate));
//		System.out.println(today.isLeapYear());
//		System.out.println(today.equals(newdate));
//		System.out.println(today.lengthOfMonth());
//		System.out.println(today.toString().substring(0,4));

	}

}
