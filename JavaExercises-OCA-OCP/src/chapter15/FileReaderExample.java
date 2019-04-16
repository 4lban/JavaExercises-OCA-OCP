package chapter15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		try {
//			FileReader reader = new FileReader("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\courseexample.txt");
			FileReader reader = new FileReader(new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\courseexample.txt"));
			char array[] = new char[10];  // 100 characters // buffer
			while((reader.read(array) != -1	)) {
				System.out.println(array);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
