package chapter14;

public class Product {

	private float price = 0;
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) throws PriceException {
		
		if (price > 300) {
			throw new PriceException("Price must be greater than 300");
		}
		
		this.price = price;
	}
	
}
