package Chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {

		/*
		 * A word may be separated from others by
		 * one blank character, multiple blank characters, 
		 * a punctuation mark, a new line character
		 * 
		 * Write a regular expression that find all the indexes 
		 * to break the sentence.
		 */

		String sentence = "I've  met many who have earned      their PhD in Computer Science with great hardship and suffering.";
		
		// need to escape the escape characters in java regex
		String[] words = sentence.split("\\W+");
		
		for (String word : words) {
			System.out.println("word: " + word);
		}
		
		
		//***************************************************************
		System.out.println("********************************************");
		
		sentence = "I've  met many who have earned          their PhD in Computer Science with great hardship and suffering..."
				+ "it is as if they have gone to hell and come back!however, most of them can hardly write any software code."
				+ "They have 	absolutely no knowledge or skills of an experienced front end developer and all of them have absolutely no skills in developing anything full stack related.";

		/*
		 * Find all spots that does not start with a capital letter after a sentence is completed.
		 * Sentence is completed if there is a period, exclamation mark or question mark.
		 */
		words = sentence.split("\\[.?!:]+[a-z]{1}");
		
		for (String word : words) {
			System.out.println("word: " + word);
		}
		
		//***************************************************************
		System.out.println("********************************************");
		
		String[] emails = {
			"btmaxhuni@",
			"btmaxhuni@d",
			"alban maxhuni@gmail.com",
			"btmaxhuni@@",
			"ALBANMAXHUNI@gmail.com",
			"btmaxhuni@@yahoo.com",
			"btmaxhunigmail.com",
			"alban.maxhuni@gmail.com",
			"alban_maxhuni@gmail.c.uk",
			"alban_maxhuni@gmail.co.uk",
			"alban-maxhuni@gmail.com.ks",
			"albanmaxhuni65@gmail.com",
			"alban_maxhuni@gmail.co.45",
			"talha@45.net.ks"
		};
		
		String regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9]+(\\.[a-z]{2,})+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;  
		
		for (String string : emails) {
			matcher = pattern.matcher(string);
			System.out.println(string + "\t" + matcher.matches());
		}
		
		//***************************************************************
		System.out.println("********************************************");
		
		String[] urls = {
			"https://www.google.com/search",
			"https://wwwgoogle.com/search",
			"http://javathlon.com/quiz",
			"htp://facebook.com/al"
		};
		
		regex = "(http(s)?)://(www\\.)?([a-z0-9]+.[a-z0-9]{2,})/([a-z0-9]*)";
		Pattern p = Pattern.compile(regex);
		Matcher m;
		
		for (String url : urls) {
			m = p.matcher(url);
			
			if(m.matches()) {
				System.out.println(url + " \t" + "IS VALID");
				System.out.println("Whole match:\t" + m.group(0)); // whole expression
				System.out.println("Protocol:\t" + m.group(1)); // first open parantheses
				System.out.println("group 2:\t" + m.group(2)); // second 
				System.out.println("group 3:\t" + m.group(3)); // third
				System.out.println("Domain name:\t" + m.group(4)); // fourth
				System.out.println("Local path:\t" + m.group(5)); // fifth
				System.out.println();
			}
			else {
				System.out.println(url + " \t" + "NOT VALID");
			}
			
			
		}
	}

}
