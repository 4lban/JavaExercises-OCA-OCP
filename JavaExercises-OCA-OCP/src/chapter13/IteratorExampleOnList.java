package chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExampleOnList {

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<Integer>();
		
		Integer int1 = new Integer(1);
		Integer int2 = new Integer(2);
		Integer int3 = new Integer(3);
		Integer int4 = new Integer(4);
		Integer int5 = new Integer(5);
		
		integerList.add(int1);
		integerList.add(int2);
		integerList.add(int3);
		integerList.add(int4);
		integerList.add(int5);
		
		Iterator<Integer> it = integerList.iterator();
		
		while (it.hasNext()) {
			int val = (Integer) it.next();
			System.out.println(val);
		}
		
		// if we need to iterate over array list once more 
		// we need to get iterator again
		it = integerList.iterator();
		System.out.println("---2nd time iteration----");
		
		while (it.hasNext()) {
			int val = (Integer) it.next();
			
			if (val == 3) {
				it.remove();
			}
			System.out.println(val);
		}
		
		it = integerList.iterator();
		System.out.println("---Iteration after remove operation----");
		while (it.hasNext()) {
			int val = (Integer) it.next();
			System.out.println(val);
		}
		
		System.out.println("\n******ListIterator*******\n");
		
		ListIterator<Integer> listIterator = integerList.listIterator();
		
		while (listIterator.hasNext()) {
			Integer i = listIterator.next();
			System.out.println(i);
		}
		
		System.out.println("--iteration from end to beginning");
		while (listIterator.hasPrevious()) {
			Integer i = listIterator.previous();
			System.out.println(i);
		}
		
	}

}
