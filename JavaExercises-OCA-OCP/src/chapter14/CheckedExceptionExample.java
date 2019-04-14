package chapter14;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
//		FileReader reader = new FileReader("C:\\alban");
		CheckedExceptionExample c = new CheckedExceptionExample();
		try {
			c.readFile();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program finished");
		
	}
	
	private void readFile() throws FileNotFoundException {
		FileReader reader = new FileReader("C:\\alban");
	}

}
