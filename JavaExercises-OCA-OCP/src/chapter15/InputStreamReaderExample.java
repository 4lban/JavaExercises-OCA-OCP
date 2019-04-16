package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamReaderExample {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\courseexample.txt");
		
		InputStream inputStram;
		try {
			inputStram = new FileInputStream(file);
			
			int i = 0;
			while((i = inputStram.read()) != -1) {
				char c = (char)i;	// ASCI code to char
				System.out.println(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
