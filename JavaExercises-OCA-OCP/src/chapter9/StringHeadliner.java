package chapter9;

public class StringHeadliner {

	/*
	 * In this method, all the words starts with a capital letter
	 * except the words like "for, the, in". 
	 * And all the remaining letters become lowercase.
	 */
	public static String makeHeadline(String input) {
		
		String[] words = input.toLowerCase().split(" ");
		String out = "";
		
		for (String word : words) {
			if (word == words[0]) {
				word = word.toUpperCase().charAt(0) + word.substring(1);
			}
			if(word.length()>1 && !word.equals("for") && !word.equals("the") && !word.equals("in")  && !word.equals("of")) {
				word = word.toUpperCase().charAt(0) + word.substring(1);
			}
			out = out.concat(word).concat(" ");
		} 
		return out;
	}
	
	public static void main(String[] args) {

		String source = "tHe IMPOrtance of the independency waR.";
		String res = StringHeadliner.makeHeadline(source);
		System.out.println(res);
	}

}
