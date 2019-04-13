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
		
		Collections.sort(employeeList, new EntranceDateComparator());
		
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
	}

}
