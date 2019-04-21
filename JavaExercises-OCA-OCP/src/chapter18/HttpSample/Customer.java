package chapter18.HttpSample;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Customer {

	private String name;
	private String surname;
	private Date registerDate;
	
	@SerializedName(value = "shopping_cart")		//override the name of attribute as "AS" in db
	private ShoppingCart shoppingCart;
	
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
	
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	
	
}
