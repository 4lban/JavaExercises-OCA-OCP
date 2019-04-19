package chapter12;

public class AmazonHumanResource implements HumanResourceAgreement {

	@Override
	public String getLeaveRequest(String id) {
		return null;
	}

	@Override
	public float[] getWorkersSalary() {
		return null;
	}

	@Override
	public void applyForSocialSecurity() {
		System.out.println("Apply for social secuirty after worker starts working");
	}

}
