package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		integerList.add(5);
		integerList.add(1);
		integerList.add(-6);
		
		System.out.println(integerList.size());
		System.out.println("3rd item is " + integerList.get(2));
		integerList.add(1, 8);
		System.out.println("Size: " + integerList.size());
		System.out.println("3rd item is " + integerList.get(2));
		integerList.remove(0);
		System.out.println("Size: " + integerList.size());
		System.out.println("0th item is " + integerList.get(0));
		
		// finds first element that has value that is searched
		int index = integerList.indexOf(-6);
		System.out.println("Index of -6 is: " + index);
		
		Integer searchItem = integerList.get(index);
		System.out.println("Item at index 2 is: " + searchItem);
		
		integerList.clear();
		System.out.println("Size: " + integerList.size());
		
		//////////////////
		System.out.println("\n********ArrayList - Custom Objects*********\n");
		
		List<Customer> customerList = new ArrayList<Customer>();
		Customer cust1 = new Customer(10, "Alban", "Maxhuni");
		Customer cust2 = new Customer(20, "Ardian", "Maxhuni");
		Customer cust3 = new Customer(30, "Advie", "Maxhuni");
		Customer cust4 = new Customer(40, "Agon", "Gjonbalaj");
		Customer cust5 = new Customer(50, "Ardiana", "Rama");
		
		customerList.add(cust1);
		System.out.println("Size of customer list: " + customerList.size());
		
		customerList.add(0, cust2);
		System.out.println("Size of customer list: " + customerList.size());
		System.out.println("First item of customer list: " + customerList.get(0));
		
		int indexOfCustomer = customerList.indexOf(cust2);
		System.out.println("Index of Ardian Maxhuni: " + indexOfCustomer);
		
//		boolean isI1 = customerList.contains(cust1);
//		System.out.println("Is i1 in this List: " + isI1);
//		
//		int intOfI1 = customerList.indexOf(cust1);
//		System.out.println("indexOfI1: " + intOfI1);
		
		customerList.add(cust3);
		customerList.add(cust4);
		customerList.add(cust5);
		
		Customer c = new Customer(40, "ASdsds", "asdasd");
		int indexOf4 = customerList.indexOf(c);
		System.out.println("indexOf4: " + indexOf4);
		
		Customer agon = customerList.get(indexOf4);
		System.out.println(agon);
		
		boolean isId4 = customerList.contains(c);
		System.out.println("Is anybody there with id 4: " + isId4);
		
		Customer c2 = new Customer(26, "addsd", "asdsdas");
		System.out.println(customerList.contains(c2));
		
		int indexOf26 = customerList.indexOf(c2);
		System.out.println("indexOf26:" + customerList.indexOf(c2));
		
	}

}
