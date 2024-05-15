/*
* Student: Samuel Ajao
* 
* Object Oriented Programming (OOP)
* 
*/
package Assignments;

public class Student {
	
	static int numberOfStudents;
	

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	//Constructors----------------------------------------------------------
	public Student() {
		
	}
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
		
	}
	//-----------------------------------------------------------------------
	
	/*
	 * 
	 * Private Methods*********
	 * Used to implement functionality out-of-sight from user.
	 * 
	 */
	private boolean checkLength(String stringLength, int minLength) {
		
		return stringLength.length() >= minLength;
	}
	
	/*
	 * 
	 * Private Methods*********
	 * 
	 * 
	 */
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName + ".");
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	
	public void setFirstName(String firstName) {
		
		if(checkLength(firstName, 2)) {
			this.firstName = firstName;
		}
		else {
			System.out.println("Invalid entry.");
		}
		
	}
	
	public String getFirstName() {
		
		return firstName;
		
	}
	
	
	public void setLastName(String lastName) {
		
		if(checkLength(lastName, 2)) {
			this.lastName = lastName;
		}
		else {
			System.out.println("Invalid entry.");
		}
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
	
	public void setPhoneNumber(String phoneNumber) {
		
		if(checkLength(phoneNumber, 10)) {
			this.phoneNumber = phoneNumber;
		}
		else {
			System.out.println("Invalid entry.");
		}
		
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
		
	}
	
	public void setGradeLevel(int gradeLevel) {
		
		if(gradeLevel >0 && gradeLevel < 13) {
			this.gradeLevel = gradeLevel;
		}
		else {
			System.out.println("Invalid entry.");
		}
		
	}
	
	public int getGradeLevel() {
		
		return gradeLevel;
		
	}
	
	

} //End Student Class
