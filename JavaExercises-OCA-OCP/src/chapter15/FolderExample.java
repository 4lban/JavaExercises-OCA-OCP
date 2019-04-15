package chapter15;

import java.io.File;
import java.io.FilenameFilter;

public class FolderExample {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban");
		
		String[] allItems = f.list();
		
		System.out.println("All items as String:");
		for(String file : allItems) {
			System.out.println(file);
		}
		
		System.out.println("\nAll items as File instance:");
		File[] allFiles = f.listFiles();
		for (File file : allFiles) {
			System.out.println(file.getName());
		}
		
		System.out.println("\nAll folders:");
		File[] allFolders = f.listFiles();
		for (File folder : allFolders) {
			if(folder.isDirectory())
				System.out.println(folder.getName());
		}
		
		System.out.println("\nAll files:");
		for (File file : allFiles) {
			if(!file.isDirectory())
				System.out.println(file.getName());
		}
		
		String search = "txt";
		System.out.println("\nAll files filtered with: " + search);
		FilenameFilter fileNameFilter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(search) || name.endsWith("docx"))
					return true;
				return false;
			}
		};
		File[] foundFiles  = f.listFiles(fileNameFilter);
		for (File foundfile : foundFiles) {
			System.out.println(foundfile.getName());
			System.out.println(foundfile.getAbsolutePath());
		}
		
		
	}
}
