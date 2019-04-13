package chapter13;

import java.util.Comparator;

public class NullComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if (o1 == null) o1 = 0;
//		if (o1 == null) o1 = Integer.MAX_VALUE;
		if (o2 == null) o2 = 0;
//		if (o2 == null) o2 = Integer.MAX_VALUE;
		
		return o1-o2;
	}

	
	
	
}
