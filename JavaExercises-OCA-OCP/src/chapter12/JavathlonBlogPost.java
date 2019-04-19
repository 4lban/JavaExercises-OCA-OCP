package chapter12;

public class JavathlonBlogPost extends BlogPost {

	@Override
	public String getHeader() {
		if (this.text != null ) {
			String[] words = text.split(" ");
			return words[0].toUpperCase() + " " + words[1].toUpperCase() + " " + words[2].toUpperCase();
		}
		return "";
	}
	
}
