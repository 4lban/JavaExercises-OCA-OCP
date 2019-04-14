package chapter14;

import chapter13.Customer;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		try {
			y = 3 / x;
		} catch (Exception e) {
			System.out.println("Please provide another number");;
		}
		System.out.println(y);
		

		Customer c = null;
//		if (c != null)
		try {
			System.out.println(c.getName());
		} catch (NullPointerException e) {
			System.out.println("Customer is null");
		}
		
	}

}
