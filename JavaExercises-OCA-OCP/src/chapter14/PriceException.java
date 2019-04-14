package chapter14;

public class PriceException extends Exception {

	public PriceException(String msg) {
		super(msg);
	}
	
	public PriceException() {
		super("Not over 300");
	}
	
}
