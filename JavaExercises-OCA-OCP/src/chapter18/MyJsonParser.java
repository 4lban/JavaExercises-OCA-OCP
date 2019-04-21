package chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class MyJsonParser {
	 // Deserialization, Json to Java object,  download GSON json library
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Alban Maxhuni\\Desktop\\18. Communicating with web services and web pages\\5.1 myjson.json";
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line = "";
			while((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line).append(System.lineSeparator());
			}
			System.out.println(stringBuffer.toString());
			
			Gson gson = new Gson();
			MyJsonObject myJsonObject = gson.fromJson(stringBuffer.toString(), MyJsonObject.class); // JSON to java object
			System.out.println("duration miliseconds: " + myJsonObject.getDurationMs());
			System.out.println("metadata: " + myJsonObject.getMetadata());
			System.out.println("name of the customer: " + myJsonObject.getCustomer().getName());
			System.out.println("number of shopping items of the customer: " 
					+ myJsonObject.getCustomer().getShoppingCart().getItems().size());
			List<ItemInformation> informationList = myJsonObject.getCustomer().getShoppingCart().getInformations();
			for (ItemInformation info : informationList) {
				System.out.println("information type : " + info.getType());
				System.out.println("information price range : " + info.getPriceRange());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		
	}

}
