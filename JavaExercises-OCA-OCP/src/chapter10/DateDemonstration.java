package chapter10;

import java.util.Date;

public class DateDemonstration {

	public static void main(String[] args) {

		Date d1 = new Date();
		long l = d1.getTime();
		System.out.println(l);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date d2 = new Date();
		long l2 = d2.getTime();
		System.out.println(l2);
		
		long diff = l2 - l;
		System.out.println(diff);
		
		System.out.println(diff / 1000 + " seconds elapsed between d2 and d1");
		
		
		int comparisonResult = d2.compareTo(d1);	// 1, 0, -1
		System.out.println(comparisonResult);	
		
		/*
		 * d2.compare(d1)	d2 is later than d1		1
		 * d2.compare(d1)	d2 and d1 is same		0
		 * d2.compare(d1)	d2 is earlier than d1	-1
		 */
		
		boolean isD2isAfterD1 = d2.after(d1);
		System.out.println(isD2isAfterD1);
		
		boolean isD2isBeforeD1 = d2.before(d1);
		System.out.println(isD2isBeforeD1);
		
	}
}
