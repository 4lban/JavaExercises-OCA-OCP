package chapter13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergingListsInSet {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list1.add(null);
		list1.add(3);
		list1.add(1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(323);
		list2.add(3);
		list2.add(4);
		list2.add(6);
		list2.add(5);
		list2.add(4);
		list2.add(0);
		list2.add(null);
		
//		Set<Integer> set = new HashSet<>(); 	
		// preserve the order of items but need to implement custom nullComparator
		Set<Integer> set = new TreeSet<>(new NullComparator());  
		set.addAll(list1);
		set.addAll(list2);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
	}

}
