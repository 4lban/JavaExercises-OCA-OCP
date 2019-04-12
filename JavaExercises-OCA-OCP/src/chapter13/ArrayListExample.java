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
		System.out.println("\n********************************\n");
		
		List<Integer> intList = new ArrayList<Integer>();
		Integer i1 = new Integer(4);
		Integer i2 = new Integer(5);
		Integer i3 = new Integer(6);
		Integer i4 = new Integer(7);
		intList.add(i3);
		System.out.println("Size of customer list: " + intList.size());
		intList.add(0, i2);
		System.out.println("Size of customer list: " + intList.size());
		System.out.println("First item is: " + intList.get(0));
		
		int indexOfIntn = intList.indexOf(i2);
		System.out.println("Index of value 5: " + indexOfIntn);
		
		boolean isI1 = intList.contains(i1);
		System.out.println("Is i1 in this List: " + isI1);
		
		int intOfI1 = intList.indexOf(i1);
		System.out.println("indexOfI1: " + intOfI1);
		
	}

}
