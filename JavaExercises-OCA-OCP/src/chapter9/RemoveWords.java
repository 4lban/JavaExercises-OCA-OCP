package chapter9;

public class RemoveWords {

	/*
	 * This method gets a source string and removes all searchWord 
	 * occurrences inside source and returns the new string as case
	 * sensitive
	 */
	public static String deleteAll(String sentence, String word) {
		
		String res = sentence;
		int i = 0;
		while(i < res.length()) {
			if(res.indexOf(word)==i) {
				res = res.substring(0, i).concat(res.substring(i+word.length()));
			}
			i++;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		String source = "Javathlon is the best resource to learn Java.";
		String word = "Java";
		String res = RemoveWords.deleteAll(source, word);
		System.out.println(res);
	}

}
