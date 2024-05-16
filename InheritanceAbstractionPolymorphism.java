package Assignments;

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Sam", "Smith", 40.00);
		Employee hourly = new HourlyEmployee("Tina", "Jones", 20.50, 40.5);
		Employee manager = new Manager("Rob","Lincoln",4500,1.15);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());

	}

}
