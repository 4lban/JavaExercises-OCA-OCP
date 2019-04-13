package chapter13;

import java.util.Comparator;

public class EntranceDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEntranceDate().before(((Employee)o2).getEntranceDate())) return 1;
		if(o1.getEntranceDate().equals(((Employee)o2).getEntranceDate())) return 0;
		else return -1;
	}


	
	
}
