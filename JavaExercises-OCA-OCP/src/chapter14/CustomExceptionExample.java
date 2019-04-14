package chapter14;

public class CustomExceptionExample {

	public static void main(String[] args) throws PriceException {

		Product p = new Product();
		p.setPrice(400);
		System.out.println(p.getPrice());
		
	}

}
