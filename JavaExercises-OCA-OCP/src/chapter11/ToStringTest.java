package chapter11;

import java.awt.Rectangle;

public class ToStringTest {

	public static void main(String[] args) {

		Customer customer = new Customer(3, "alban", "maxhuni", true, 'M');
		System.out.println(customer.toString());
		
		Rectangle rectangle = new Rectangle(0, 0, 20, 40);
		System.out.println(rectangle);
		
	}

}
