package chapter18;

import java.util.List;

public class ShoppingCard {

	private List<String> items;
	
	private List<ItemInformation> informations;

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public List<ItemInformation> getInformation() {
		return informations;
	}

	public void setInformation(List<ItemInformation> informations) {
		this.informations = informations;
	}
	
	
	
}
