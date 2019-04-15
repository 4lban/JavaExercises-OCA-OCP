package chapter15;

import java.io.File;
import java.io.IOException;

public class FileFolderCreationExample {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban");
		if(f.exists())
			System.out.println("Documents are here");
		else
			System.out.println("No such folder exists");
		if (f.isDirectory()) {
			System.out.println("This is a directory");
		}
		
		if (f.canWrite()) {
			System.out.println("We can write to this directory");
		}
		
		if (f.exists() && f.isDirectory() && f.canWrite()) {
			File newFolder = new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban\\example");
			if(!newFolder.exists())
				newFolder.mkdir();
			
			newFolder = new File(f.getAbsolutePath() + "\\example2");
			if(!newFolder.exists())
				newFolder.mkdir();
			
			// we can not create folder and subfolder in the same time
			newFolder = new File(f.getAbsolutePath() + "\\example3\\example4");
			if(!newFolder.exists()) {
				boolean isCreated = newFolder.mkdir();
				if (isCreated)
					System.out.println("Folder has been created");
				else
					System.out.println("Folder creation failed");
			}
			
			newFolder = new File(f.getAbsolutePath() + "\\example3");
			if(!newFolder.exists()) {
				boolean isCreated = newFolder.mkdir();
				if (isCreated)
					System.out.println("Folder has been created");
				else
					System.out.println("Folder creation failed");
			}
			
			newFolder = new File(newFolder.getAbsolutePath() + "\\example4");
			if(!newFolder.exists()) {
				boolean isCreated = newFolder.mkdir();
				if (isCreated)
					System.out.println("Folder has been created");
				else
					System.out.println("Folder creation failed");
			}
			
			System.out.println("\n********Creating a File********\n");
			
			File newTxtFile = new File(newFolder.getAbsolutePath() + "\\alban.txt");
			try {
				boolean isFileCreated = newTxtFile.createNewFile();
				if (isFileCreated) 
					System.out.println("File has been created");
				else
					System.out.println("File creation failed");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
