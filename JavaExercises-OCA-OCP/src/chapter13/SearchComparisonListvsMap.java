package chapter13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchComparisonListvsMap {

	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<>();
		
		Map<Integer, Customer> customerMap = new HashMap<>();
		
		for (int i = 0; i < 900000; i++) {
			Customer c = new Customer(i, "Alban"+i, "Maxhuni"+i);
			customerList.add(c);
			customerMap.put(c.getId(), c);
		}
		
		Customer searched = new Customer(899999, "Alban899999", "Maxhuni899999");
		
		long time1 = new Date().getTime();
		customerList.indexOf(searched);
		long time2 = new Date().getTime();
		System.out.println("List search time: " + (time2-time1));
		
		time1 = new Date().getTime();
		customerMap.get(searched);
		time2 = new Date().getTime();
		System.out.println("Map search time: " + (time2-time1));
		
		
	}

}
