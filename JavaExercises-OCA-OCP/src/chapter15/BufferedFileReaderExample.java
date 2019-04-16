package chapter15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderExample {

	public static void main(String[] args) {

		BufferedReader bufferedReader = null;
		try {
//			FileReader reader = new FileReader("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\courseexample.txt");
			FileReader reader = new FileReader(new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\courseexample.txt"));
			bufferedReader = new BufferedReader(reader);
			
			String s;
			StringBuilder stringBuilder = new StringBuilder();
			while((s = bufferedReader.readLine()) != null) {
				stringBuilder.append(s).append(System.lineSeparator());
			}
			String content = stringBuilder.toString();
			System.out.println(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(bufferedReader != null)
					bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
