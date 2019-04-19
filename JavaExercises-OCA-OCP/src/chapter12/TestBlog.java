package chapter12;

public class TestBlog {

	public static void main(String[] args) {

		JavathlonBlogPost javathlonBlogPost = new JavathlonBlogPost();
		javathlonBlogPost.setText("asdsada asda, adsad asdjhsk adjks as kdhas  djashkl");
		String header = javathlonBlogPost.getHeader();
		System.out.println(header);
	}
}
