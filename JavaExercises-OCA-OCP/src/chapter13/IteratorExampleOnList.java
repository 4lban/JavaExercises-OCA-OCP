package chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExampleOnList {

	public static void main(String[] args) {

		Customer cust1 = new Customer(10, "Alban", "Maxhuni");
		Customer cust2 = new Customer(20, "Ardian", "Maxhuni");
		Customer cust3 = new Customer(30, "Advie", "Maxhuni");
		Customer cust4 = new Customer(40, "Agon", "Gjonbalaj");
		Customer cust5 = new Customer(50, "Ardiana", "Rama");
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		customerList.add(cust5);
		
		Iterator<Customer> it = customerList.iterator();
		
		while (it.hasNext()) {
			Customer val = (Customer) it.next();
			System.out.println(val);
		}
		
		// if we need to iterate over array list once more 
		// we need to get iterator again
		it = customerList.iterator();
		System.out.println("---2nd time iteration----");
		
		while (it.hasNext()) {
			Customer val = (Customer) it.next();
			
			if (val.getName().equals("Advie")) {
				it.remove();
			}
			System.out.println(val);
		}
		
		it = customerList.iterator();
		System.out.println("---Iteration after remove operation----");
		while (it.hasNext()) {
			Customer val = (Customer) it.next();
			System.out.println(val);
		}
		
		System.out.println("\n******ListIterator*******\n");
		
		ListIterator<Customer> listIterator = customerList.listIterator();
		
		while (listIterator.hasNext()) {
			Customer i = listIterator.next();
			System.out.println(i);
		}
		
		System.out.println("--iteration from end to beginning");
		while (listIterator.hasPrevious()) {
			Customer i = listIterator.previous();
			System.out.println(i);
		}
		
	}

}
