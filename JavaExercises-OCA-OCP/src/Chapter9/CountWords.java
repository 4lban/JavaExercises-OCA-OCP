package Chapter9;
import javax.swing.JOptionPane;

public class CountWords {

	public static int countWord(String source, String searchWord) {
		
		source = source.toLowerCase();
		searchWord = searchWord.toLowerCase();
		
		int count = 0;
		for (int i = 0; i < source.length(); i++) {
			if (i == source.indexOf(searchWord, i)) {
				System.out.println("ocurred at index " + i);
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {

		String source = "Now let's go to do something. Let me explain it first.";
		String searchWord = JOptionPane.showInputDialog("write word to serch for:");
		System.out.println(countWord(source, searchWord));
		
	}

}
//