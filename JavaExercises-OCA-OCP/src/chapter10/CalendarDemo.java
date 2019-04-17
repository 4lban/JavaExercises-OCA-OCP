package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		Date d = calendar.getTime();
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("We are on " + day + "th day of month");
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println("We are on " + (month+1) + "th month of the year");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Tomorrow: " + sdf.format(calendar.getTime()));
		
		calendar.set(Calendar.YEAR, 2020);
		System.out.println("Next year: " + sdf.format(calendar.getTime()));

		calendar.add(Calendar.WEEK_OF_YEAR, 25);
		System.out.println("25 weeks later: " + sdf.format(calendar.getTime()));
		
		calendar.add(Calendar.WEEK_OF_YEAR, -1);
		System.out.println("24 weeks later: " + sdf.format(calendar.getTime()));

		
		calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println("This week on monday: " + sdf.format(calendar.getTime()));
		
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.MONTH, Calendar.OCTOBER);
		System.out.println("1st October 2019: " + sdf.format(calendar.getTime()) + " day:" + calendar.get(Calendar.DAY_OF_WEEK));

	}
}
