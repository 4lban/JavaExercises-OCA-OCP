package chapter10;

public class WrapperClassDemo {

	public static void main(String[] args) {

		int x = 5;
		Integer xInstance = x;		//auto-boxing
		Integer xInstance2 = 65;	//auto-boxing
		
		String xString = xInstance.toString();
		xString = xString + " goats";
		System.out.println(xString);
		
		
		String input = "-89";
		int newInt = Integer.parseInt(input);	//auto-unboxing
		newInt++;
		System.out.println(newInt);
		System.out.println(Math.abs(newInt));
		
		
		Double doubleInstance = 6.59;
		newInt = doubleInstance.intValue();
		System.out.println(newInt);
		
		String doubleString = "-99.99";
		double doubleValue = Double.parseDouble(doubleString);
		System.out.println(doubleValue + 10);
		
		double min = Double.min(4.5, 40.6);
		System.out.println(min);
		
		
		Short s = 5;
		Long l = 45l;
		Float f = 5.6f;
		
		
		Character c = 'R';
		boolean isVAdigit = c.isDigit('v');
		System.out.println(isVAdigit);
		
		isVAdigit = Character.isDigit(c);
		System.out.println(isVAdigit);
		
		System.out.println(Character.isAlphabetic(c));
		
	}

}
