package chapter12;

public class InterfaceTest {

	public static void main(String[] args) {
		
		HumanResourceAgreement google = new GoogleHumanResource();
		HumanResourceAgreement amazon = new AmazonHumanResource();
		
		google.applyForSocialSecurity();
		amazon.applyForSocialSecurity();
		
	}
}
