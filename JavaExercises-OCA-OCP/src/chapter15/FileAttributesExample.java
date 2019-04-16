package chapter15;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FileAttributesExample {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Alban Maxhuni\\Desktop\\alban");
		File[] allFiles = file.listFiles();
		for (File f : allFiles) {
			if (f.isFile()) {
				long size = f.length();
				long sizeInKB = size / 1024;
				System.out.println(f.getName() + " " + sizeInKB + "KB");
				
				long lastModified = f.lastModified();
				Date lastModifiedTime = new Date(lastModified);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
				System.out.println(sdf.format(lastModifiedTime));
				
			}
		}
		
		System.out.println("\nOrdered by Last date modified");
		Arrays.sort(allFiles, new LastModifiedTimeComparator());
		for (File f : allFiles) {
			long lastModified = f.lastModified();
			Date lastModifiedTime = new Date(lastModified);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			System.out.println(f.getName() + " " + sdf.format(lastModifiedTime));
		}
		
		System.out.println("\nOrdered by size");
		Arrays.sort(allFiles, new FileSizeComparator());
		for (File f : allFiles) {
			System.out.println(f.getName() + " " + f.length());
		}
		
		System.out.println("\nFilter by any lastModifiedTime");
		FileFilter lastModifiedTimeFilter = new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				Calendar c = Calendar.getInstance();
				c.set(Calendar.HOUR, 0);
				c.set(Calendar.MINUTE, 0);
				Date beginningOfDay = c.getTime();
				if (file.lastModified() > beginningOfDay.getTime())
					return true;
				return false;
			}
		};
		
		System.out.println("Today modified");
		File[] todayModifiedFiles = file.listFiles(lastModifiedTimeFilter);
		for (File f : todayModifiedFiles) {
			long lastModified = f.lastModified();
			Date lastModifiedTime = new Date(lastModified);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			System.out.println(f.getName() + " " + sdf.format(lastModifiedTime));
		}
	}

}
