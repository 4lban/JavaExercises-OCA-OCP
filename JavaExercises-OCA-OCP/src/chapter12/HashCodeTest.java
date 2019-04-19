package chapter12;

import chapter11.Customer;

public class HashCodeTest {

	public static void main(String[] args) {

		Customer c1 = new Customer(01, "Alban", "Maxhuni", true, 'm');
		Customer c2 = new Customer(05, "Ardian", "Maxhuni", false, 'm');
		Customer c3 = new Customer(12, "Adi", "Maxhuni", true, 'f');
		Customer c4 = new Customer(45, "Hashim", "Maxhuni", false, 'm');
		Customer c5 = new Customer(44, "Lana", "Rama", true, 'f');
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c5.hashCode());
		
	}

}
