package chapter12;

public class InterfaceIterationTest {

	public static void main(String[] args) {
		
		AmazonHumanResource amazon = new AmazonHumanResource();
		AmazonHumanResource amazon2 = new AmazonHumanResource();
		
		GoogleHumanResource google = new GoogleHumanResource();
		GoogleHumanResource google2 = new GoogleHumanResource();
		
		HumanResourceAgreement[] resources = new HumanResourceAgreement[4];
		resources[0] = amazon;
		resources[1] = amazon2;
		resources[2] = google;
		resources[3] = google2;
		
		for (HumanResourceAgreement agreement : resources) {
			agreement.applyForSocialSecurity();
		}
		
	}

}
