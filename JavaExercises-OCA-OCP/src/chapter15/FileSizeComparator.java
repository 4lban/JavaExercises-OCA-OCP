package chapter15;

import java.io.File;
import java.util.Comparator;

public class FileSizeComparator implements Comparator<File>{

	public static void main(String[] args) {

	}

	@Override
	public int compare(File o1, File o2) {
		if(o1.length() > o2.length())
			return 1;
		else if(o1.length() == o2.length())
			return 0;
		else 
			return -1;
	}

}
