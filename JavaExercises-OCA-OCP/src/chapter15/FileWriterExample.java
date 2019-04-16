package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		FileWriter writer = null;
		try {
			writer = new FileWriter("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\maxhuni.txt", true);
			writer.append(System.lineSeparator());
			writer.append("course");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer != null) {
					writer.flush();
					writer.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
