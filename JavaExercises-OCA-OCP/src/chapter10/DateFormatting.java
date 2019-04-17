package chapter10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedString = sdf.format(d);
		System.out.println(formattedString);
		
	}
}
