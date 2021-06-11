package com.scg.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
//		LocalDateTime newdt=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		LocalDateTime newdt=LocalDateTime.now(ZoneId.of("Asia/Dubai"));
//		LocalDateTime newdt=LocalDateTime.of(2000, 12, 31, 10, 55);
//		LocalDateTime newdt=datetime.minusYears(10);
//		LocalDateTime newdt=datetime.minusMonths(2);
//		LocalDateTime newdt=datetime.minusDays(5);
//		LocalDateTime newdt=datetime.minusHours(12);
//		LocalDateTime newdt=datetime.minusMinutes(10);
//		LocalDateTime newdt=datetime.minusSeconds(30);
//		LocalDateTime newdt=datetime.plusYears(10);
//		LocalDateTime newdt=datetime.plusMonths(2);
//		LocalDateTime newdt=datetime.plusDays(5);
//		LocalDateTime newdt=datetime.plusHours(12);
//		LocalDateTime newdt=datetime.plusMinutes(10);
//		LocalDateTime newdt=datetime.plusSeconds(30);
//		LocalDateTime newdt=datetime.withYear(2000);
//		LocalDateTime newdt=datetime.withDayOfMonth(10);
//		LocalDateTime newdt=datetime.withMonth(12);
//		LocalDateTime newdt=datetime.withHour(12);
//		LocalDateTime newdt=datetime.withMinute(20);
//		LocalDateTime newdt=datetime.withSecond(30);
		System.out.println(newdt);
		
//		System.out.println(datetime.getHour());
//		System.out.println(datetime.getMinute());
//		System.out.println(datetime.getSecond());
//		System.out.println(datetime.getYear());
//		System.out.println(datetime.getMonthValue());
//		System.out.println(datetime.getDayOfMonth());
		
		DateTimeFormatter myformat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(datetime.format(myformat));
		
		Instant i=Instant.now();
		System.out.println(i);

	}

}
