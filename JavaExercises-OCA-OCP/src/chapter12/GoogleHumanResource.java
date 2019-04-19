package chapter12;

public class GoogleHumanResource implements HumanResourceAgreement {

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
		System.out.println("Apply the social secuirty as soon as worker accepted the contract");
	}
	
}
