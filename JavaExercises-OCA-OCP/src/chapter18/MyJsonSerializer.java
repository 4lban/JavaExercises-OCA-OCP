package chapter18;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyJsonSerializer {
	// Preparing Java object to send outside JVM like database, json etc.
	
	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.setDateFormat("yyyy - MM - dd")
				.create();
		
		MyJsonObject myJsonObject = new MyJsonObject();
		
		myJsonObject.setProduct("My headphone");
		myJsonObject.setDescription("This is the latest edition of the headphone");
		myJsonObject.setStartTime(System.currentTimeMillis());
		
		Customer customer = new Customer();
		customer.setName("Filan");
		customer.setSurname("Fisteku");
		customer.setRegisterDate(new Date());
		
		ItemInformation info1 = new ItemInformation();
		info1.setType("Type 1");
		info1.setPriceRange("200-2000");
		
		ItemInformation info2 = new ItemInformation();
		info2.setType("Type 2");
		info2.setPriceRange("300-3000");
		
		List<ItemInformation> infoList = Arrays.asList(info1, info2);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setInformations(infoList);
		
		customer.setShoppingCart(shoppingCart);
		
		myJsonObject.setCustomer(customer);
		
		System.out.println(gson.toJson(myJsonObject));
		
	}

}
