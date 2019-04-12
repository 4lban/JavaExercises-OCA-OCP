package chapter13;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordRemover {

	/*
	 * remove all the occurrences of a letter after the first occurrence
	 */
	public static String removeDuplicateLetters(String s) {
		
		StringBuilder output = new StringBuilder();
		
		Set<Character> letters = new HashSet<>();
		
		for (Character c : s.toCharArray()) {
			if (!letters.contains(c) || c.equals(' ')) {
				letters.add(c);
				output.append(c);
			}
		}
		
		return output.toString();
	}
	
	public static void printLetters(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.substring(i, i+1));
		}
	}
	
	public static void main(String[] args) {
		
		String sentence = "Collections is the most important item in Java development";
		System.out.println(removeDuplicateLetters(sentence));
		
	}

}
