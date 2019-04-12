package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Customer cust1 = new Customer(10, "Alban", "Maxhuni");
		Customer cust2 = new Customer(20, "Ardian", "Maxhuni");
		Customer cust3 = new Customer(30, "Advie", "Maxhuni");
		Customer cust4 = new Customer(40, "Agon", "Gjonbalaj");
		Customer cust5 = new Customer(50, "Ardiana", "Rama");
		Customer cust6 = new Customer(60, "Jim", "Carrey");
		
	
		Map<String, Customer> map = new HashMap<String, Customer>();
		map.put(cust1.getName(), cust1);	// key should be a string or number
		map.put(cust2.getName(), cust2);    // we choose key to be String
		map.put(cust3.getName(), cust3);
		map.put(cust4.getName(), cust4);
		map.put(cust5.getName(), cust5);
		map.put(cust5.getName(), cust5);
		map.put(cust5.getName(), cust5);
		map.put(cust5.getName(), cust5);
		map.put(cust5.getName(), cust5);
		map.put(cust5.getName(), cust6);
		
		// search by name
		Customer c = map.get("Alban");
		System.out.println(c);
		
		// search by Id
		Map<Integer, Customer> map2 = new HashMap<Integer, Customer>();
		map2.put(001, cust1);	// key should be a string or number
		map2.put(002, cust2);
		map2.put(003, cust3);
		map2.put(004, cust4);
		map2.put(005, cust5);
		
		Customer c2 = map2.get(5);
		System.out.println(c2);
		
		c2 = map.get(5);
		System.out.println(c2);
		
//		Map<Integer, Customer> map2 = new HashMap<Integer, Customer>(int);
// 		the higher the number of memory blocks (int) performance will be better
		
		
		System.out.println("\n*************Iterating over Maps**************\n");
		
		Collection<Customer> collection = map.values();  
		Iterator<Customer> it = collection.iterator();
		
		while (it.hasNext()) {
			Customer customerReference = it.next();
			System.out.println(customerReference.getName());
		}
		
		// entrySet means key + value
		Collection<Map.Entry<String, Customer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Customer>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Map.Entry<String, Customer> entry = entryIt.next();
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
		
		// keySet for key collection 
		Collection<String> keyCollection = map.keySet();
		Iterator<String> keyIterator = keyCollection.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println(key);
		}
		
//		even if we put same Customer inside one key over and over again
//		it is stores only once because HashMap checks if that customer
//		has been put in this map before, if it exist already it will not
// 		put this customer instance inside the same key value pair
		
//		If the key already exists in the map the new item
// 		will override the existing item 
		
	}

}
