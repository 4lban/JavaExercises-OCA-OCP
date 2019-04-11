package chapter12;

public class TimeTest {

	public static void main(String[] args) {

		MyTime time1 = new MyTime(14, TimeUnit.DAY);
		MyTime time2 = new MyTime(2, TimeUnit.WEEK);
		MyTime time3 = new MyTime(8, TimeUnit.WEEK);
		MyTime time4 = new MyTime(2, TimeUnit.MONTH);
		
		System.out.println(time1.equals(time2));
		System.out.println(time3.equals(time4));
		System.out.println(time1.equals(time4));
	}

}
