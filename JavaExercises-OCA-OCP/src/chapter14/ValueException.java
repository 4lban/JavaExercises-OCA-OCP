package chapter14;

public class ValueException extends Exception {

	public ValueException() {
		super("Minute should be between 0 and 60");
	}
	
}
