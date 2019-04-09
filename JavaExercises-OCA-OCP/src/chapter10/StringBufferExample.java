package chapter10;

public class StringBufferExample {

	public static void main(String[] args) {
		
		String s = "alban";
		String s2 = s + " maxhuni"; 
//		System.out.println(s2);
		
		/* 
		 * it will create 1000 new strings  // s = s + "a"
		 * (new reference and will not modify original reference)
		 * so it's costly
		 */
		for (int i = 0; i < 1000; i++) {
			s = s + "a";
		}
		System.out.println(s);
		
		// it creates stringbuffer variable with default length
		// so it create only one string and modifies it
		StringBuffer buffer = new StringBuffer();
		buffer.append("maxhuni");
		buffer.append("alban");
		String text = buffer.toString();
		System.out.println(text);
		
		for (int i = 0; i < 1000; i++) {
			buffer.append(i).append(" ");  // it modifies same memory locations
		}
		s = buffer.toString();
		System.out.println(s);
		
		StringBuffer buffer2 = new StringBuffer();
		buffer2.append("alban");
		buffer2.insert(0, "kosovo");
		buffer2.delete(2, 5);
		System.out.println(buffer2.toString());
		
		/* 
		 * StringBuilder is used for asynchronized environments (single thread)
		 * StringBuffer guarantees synchronization (multiple thread)
		 * methods are similar
		 */
	}

}
