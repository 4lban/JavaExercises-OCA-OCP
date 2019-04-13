package chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(30, 3000.0, "01/01/2017"));
		employeeList.add(new Employee(28, 4000.0, "01/01/2016"));
		employeeList.add(new Employee(34, 1000.0, "01/01/2019"));
		employeeList.add(new Employee(30, 3000.0, "01/01/2020"));
		
		Collections.sort(employeeList, new AgeComparator());
		
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
		System.out.println("\n***********Binary Search********\n");
		
		int index = Collections.binarySearch(employeeList, new Employee(30, 0.0, "09/09/2099"), new AgeComparator());
		
		if (index >= 0) {
			System.out.println("Found at index: " + index + "\n"+ employeeList.get(index));
		}
		
	}

}
