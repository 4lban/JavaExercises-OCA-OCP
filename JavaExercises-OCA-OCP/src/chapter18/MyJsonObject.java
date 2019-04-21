package chapter18;

public class MyJsonObject {

	private String product;
	private String description;
	private long duration_ms;
	private long start_time_ms;
	private String metadata;
	
	private Customer customer;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getDuration_ms() {
		return duration_ms;
	}
	public void setDuration_ms(long duration_ms) {
		this.duration_ms = duration_ms;
	}
	public long getStart_time_ms() {
		return start_time_ms;
	}
	public void setStart_time_ms(long start_time_ms) {
		this.start_time_ms = start_time_ms;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
