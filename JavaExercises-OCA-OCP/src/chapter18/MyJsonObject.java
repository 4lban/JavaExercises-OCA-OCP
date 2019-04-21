package chapter18;

import com.google.gson.annotations.SerializedName;

public class MyJsonObject {

	private String product;
	private String description;
	@SerializedName("duration_ms")
	private long durationMs;
	@SerializedName("start_time_ms")
	private long startTime;
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
	public long getDurationMs() {
		return durationMs;
	}
	public void setDurationMs(long durationMs) {
		this.durationMs = durationMs;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
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
