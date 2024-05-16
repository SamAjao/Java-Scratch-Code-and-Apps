package Assignments;

public class Manager extends Employee{
	

	private double bonusPercentage;
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}

	@Override
	public double calculatePay() {
		
		return getPay() * 80 * bonusPercentage;
	}

	public double getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	


}
