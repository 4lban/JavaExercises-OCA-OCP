package chapter20;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

//		List myValues = new ArrayList<>();
//		List<Integer> myValues = new ArrayList<>();
//		List<Double> myValues = new ArrayList<>();
		List<Number> myValues = new ArrayList<>();	// Integer and Double extends Number
		myValues.add(5);
		myValues.add(5.5);
		
		GenericsExample genericsExample = new GenericsExample();
		genericsExample.sum(myValues);
	}
	
	private void sum(List<Number> values) {
		double sum = 0;
		for (int i = 0; i < values.size(); i++) {
//			sum += values.get(i);			// we cannot increment Objects as Integer
//			sum += (Integer)values.get(i);	// Runtime error, String cannot incremeent
			sum += values.get(i).doubleValue();
		}
		System.out.println(sum);
	}

}
