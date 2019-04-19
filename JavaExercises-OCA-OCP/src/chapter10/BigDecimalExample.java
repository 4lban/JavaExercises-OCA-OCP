package chapter10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {

	public static void main(String[] args) {

		double a = 3.0;
		double b = 2.0;			
		System.out.println(a-b);	// 1.0	
		
		a = 1 / 7;
		b = 1 / 7;
		System.out.println(a-b);	// 0.0
		
		a = 0.003;
		b = 0.002;
		System.out.println(a-b);	// 0.001
		
		a = 0.00003;
		b = 0.00002;				// expected 0.00001
		System.out.println(a-b);	// 9.999999999999999E-6
		
		BigDecimal aBig = new BigDecimal("0.00003");	// better as String
		BigDecimal bBig = new BigDecimal("0.00002");
		System.out.println(aBig.subtract(bBig));
		System.out.println(aBig.multiply(bBig));					// short
		System.out.println(aBig.multiply(bBig).toPlainString());	// full
		
		a = 1 / 7777;
		b = 1 / 7777;
		boolean isSame = a == b;
		System.out.println(isSame);		// true
		
		a = 0.00003;
		b = 0.00002;
		double expected = 0.00001;
		isSame = (a-b) == expected;
		System.out.println(isSame);		// false ???
		
		aBig = new BigDecimal("0.00003");
		bBig = new BigDecimal("0.00002");
		BigDecimal expectedBig = new BigDecimal("0.00001");
		int result = (aBig.subtract(bBig)).compareTo(expectedBig);
		if (result == 0) {
			System.out.println("a-b = expected");	
			System.out.println(aBig.subtract(bBig).toPlainString());
		}
		
//		bBig = bBig.setScale(2, RoundingMode.CEILING);
//		System.out.println(bBig.toPlainString());
		
		bBig = bBig.setScale(2, RoundingMode.FLOOR);
		System.out.println(bBig.toPlainString());
		
		
	}

}
