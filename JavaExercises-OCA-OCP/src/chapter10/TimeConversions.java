package chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeConversions {

	public static void main(String[] args) {

		/* String -> Date -> Calendar */
		String timeString = "01/02/2013";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse(timeString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date.getTime());
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		calendar.set(Calendar.YEAR, 2020);
		System.out.println(sdf.format(calendar.getTime()));
		
		
		/* Calendar -> Date -> String */
		Date d2 = calendar.getTime();
		String s = sdf.format(d2);
		System.out.println("Formatted date: " + s);
		
	}

}
