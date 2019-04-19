package chapter12;

public abstract class BlogPost {

	protected String text = null;
	protected String[] tags = null;
	protected String firstName = null;
	protected String lastName = null;
	protected String nickname = null;
	protected String header = null;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getTags() {
		String[] myTags = null;
		if(text != null) {
			String[] words = text.split(" ");
			myTags = new String[3];
			myTags[0] = words[2];
			myTags[1] = words[8];
			myTags[2] = words[5];
		}
		return myTags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickname() {
		if (firstName != null && lastName != null) {
			return firstName + "_" + lastName;
		}
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHeader() {
		if(text != null) {
			String[] words = text.split(" ");
			return words[0] + " " + words[1] + " " + words[2];
		}
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	
}
