package chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDiffCalculator {

	public static String getTimeDifference(String date1, String date2) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Date dt1;
		Date dt2;
		try {
			dt1 = sdf.parse(date1);
			dt2 = sdf.parse(date2);
			
			long difference = dt1.getTime() - dt2.getTime();

			long daysInMilliseconds = 1000 * 60 * 60 * 24;
			long hoursInMilliseconds = 1000 * 60 * 60;
			long minutesInMilliseconds = 1000 * 60;
			long secondsInMilliseconds = 1000;
			
			long days = difference / daysInMilliseconds;
			difference = difference % daysInMilliseconds;
			
			long hours = difference / hoursInMilliseconds;
			difference = difference % hoursInMilliseconds; 
			
			long minutes = difference / minutesInMilliseconds;
			difference = difference % minutesInMilliseconds;
			
			long seconds = difference / secondsInMilliseconds;
			return days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		String s = DateDiffCalculator.getTimeDifference("09/08/2016 02:30:22", "01/08/2016 01:23:09");
		System.out.println(s);
	}

}
