package chapter15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileConverter {

	public void convertFile(String inputPath, String outputPath, String newDateFormat) {
		
		
		BufferedReader bufferedReader = null;
		FileWriter writer = null;
		SimpleDateFormat sdfOld = new SimpleDateFormat("MMMM dd, yyyy");
		SimpleDateFormat sdfNew = new SimpleDateFormat(newDateFormat);
		
		try {
			bufferedReader = new BufferedReader(new FileReader(new File(inputPath)));
			writer = new FileWriter(new File(outputPath));
			String line;
			while((line = bufferedReader.readLine()) != null) {
				
				Date date = sdfOld.parse(line);
				String newFormatDate = sdfNew.format(date);
				// process the data
				
				writer.write(newFormatDate);
				writer.write(System.lineSeparator());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.flush();
				writer.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		FileConverter converter = new FileConverter();
		converter.convertFile("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\source.txt", 
							"C:\\Users\\Alban Maxhuni\\Desktop\\alban\\destination.txt", 
							"dd/MM/yyyy");
	}

}
