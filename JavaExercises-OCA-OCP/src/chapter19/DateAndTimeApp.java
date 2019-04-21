package chapter19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeApp {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		System.out.println("\n**********operations*************");
		
		LocalDate twoMonthsLater = localDate.plusMonths(2);
		System.out.println(twoMonthsLater);
		
		LocalDate twoMonthsAndThreeDaysLater = localDate.plusMonths(2).plusDays(3);
		System.out.println(twoMonthsAndThreeDaysLater);
		
		System.out.println(localDate);
		
		Month month = localDate.getMonth();
		System.out.println(month);
		
		DayOfWeek day = localDate.getDayOfWeek();
		System.out.println(day);
		
		LocalDateTime startOfToday = localDate.atStartOfDay();
		System.out.println(startOfToday);
		
		boolean isAfter = twoMonthsAndThreeDaysLater.isAfter(localDate);
		System.out.println(isAfter);
		
		LocalDate firstJanuaryThisYEar = localDate.withMonth(1).withDayOfMonth(1);
		System.out.println(firstJanuaryThisYEar);
		
		LocalDateTime timeWithMinuteFiftyNine = localDateTime.withMinute(59);
		System.out.println(timeWithMinuteFiftyNine);
	}

}
