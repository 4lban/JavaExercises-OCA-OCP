package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LetterCounter {

	/*
	 * calculate the occurrence count of each letter inside given
	 * sentence. For instance if the sentence below is given as parameter,
	 * the map result should yield.
	 */
	static Map<String, Integer> harfSay(String sentence){
		Map<String, Integer> letters = new HashMap<String, Integer>();
		for (int i = 0; i < sentence.length(); i++) {
			String letter = sentence.substring(i, i+1);
			if (letters.containsKey(letter)) {
				int count = letters.get(letter);
				count++;
				letters.put(letter, count);
			} else {
				letters.put(letter, 1);
			}
		}
		return letters;
	}
	
	public static void printTheLetterCounts(Map m) {
		Collection<Map.Entry<String, Integer>> entrySet = m.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("key: '" + entry.getKey() + "' count: " + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		String sentence = "Java, is the most used object oriented language";
		printTheLetterCounts(harfSay(sentence));
	}
	
}
