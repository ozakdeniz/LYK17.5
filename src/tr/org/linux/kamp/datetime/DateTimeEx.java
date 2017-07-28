package tr.org.linux.kamp.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeEx {
	
	public static void testLocalDateTime() {
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("Current Time :" + currentTime);
		System.out.println("Current Date :" + currentDate);
		
		Month month = currentTime.getMonth();
		
		int day = currentTime.getDayOfMonth();
		int second = currentTime.getSecond();
		
		System.out.println("Ay = "+ month + " Gün = "+ day+ "Second = "+ second);
		
		LocalDateTime timeExample = currentTime.withDayOfMonth(8).withYear(2017);
		
		LocalDate dateExample = LocalDate.of(2017, Month.JULY, 26);
		System.out.println("dateExample = "+ dateExample);
	}
	
	public static void main(String[] args) {
		testLocalDateTime();
	}

}
