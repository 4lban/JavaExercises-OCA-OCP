package chapter18;

public class Customer {

	private String name;
	private String surname;
	
	private ShoppingCard shopping_cart;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public ShoppingCard getShopping_cart() {
		return shopping_cart;
	}
	public void setShopping_cart(ShoppingCard shopping_cart) {
		this.shopping_cart = shopping_cart;
	}
	
	
	
}
