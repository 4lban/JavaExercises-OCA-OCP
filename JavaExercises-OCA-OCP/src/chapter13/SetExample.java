package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {

		Customer cust1 = new Customer(10, "Alban", "Maxhuni");
		Customer cust2 = new Customer(20, "Ardian", "Maxhuni");
		Customer cust3 = new Customer(30, "Adi", "Maxhuni");
		Customer cust4 = new Customer(40, "Agon", "Gjonbalaj");
		Customer cust5 = new Customer(50, "Lana", "Rama");
		Customer cust6 = new Customer(60, "Jim", "Carrey");
		Customer cust7 = new Customer(10, "Jim", "Carrey");

		
		Set<Customer> set = new HashSet<Customer>();
		
		set.add(cust1);
		set.add(cust1);
		set.add(cust1);
		set.add(cust1);
		set.add(cust1);
		set.add(cust7);
		
		System.out.println(cust1.hashCode());
		System.out.println(cust7.hashCode());
		
		Iterator<Customer> it = set.iterator();
		while (it.hasNext()) {
			Customer c = it.next();
			System.out.println(c.getName());
		}
		
	}

}
