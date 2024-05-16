package Assignments;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String directReport;
	
	
	/*public Employee() {
		
	}
	*/
	
	public Employee(String firstName, String lastName, double pay) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
	}
	
	
	public abstract double calculatePay(); //Method is polymorphic. Inheritor Classes must define this method for themselves.
	
	
	public String getInformation() {
		
		return "Name:" + firstName + " " + lastName +"\nAdress: " + address
					+ "\nPay: " + pay + "\nDirect Report: " + directReport;
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


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDirectReport() {
		return directReport;
	}


	public void setDirectReport(String directReport) {
		this.directReport = directReport;
	}

}
