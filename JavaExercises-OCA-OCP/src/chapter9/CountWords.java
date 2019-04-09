package chapter9;

public class CountWords {

    public static int countWords(String source, String searched) {

        source = source.toLowerCase();
        searched = searched.toLowerCase();

        int index = 0;
        int count = 0;

        while (index != -1) {
            index = source.indexOf(searched, index);
            if(index != -1) {
                count ++;
            }
            if(index == -1) {
                break;
            }
            if(index < source.length() - 1)
                index++;
        }
        return count;
    }
	
    public static void main(String args[]) {

        String sourceString = "Now let's go to do something. Let me explain it first.";
        String word = "let";

        int occurrenceCount = CountWords.countWords(sourceString, word);
        System.out.println(word + " exists " + occurrenceCount + " times inside " + sourceString);
    }
}
