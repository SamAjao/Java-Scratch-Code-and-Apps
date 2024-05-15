		/*
		 * Student: Samuel Ajao
		 * 
		 * Object Oriented Programming (OOP)
		 * 
		 * DVD Player
		 * Properties:
		 * 	- Height
		 * 	- Weight
		 * 	- Width
		 * 	- Color
		 * Functionality:
		 * 	-Play
		 * 	-Fast Forward
		 * 	-Rewind
		 * 	-Pause
		 * 
		 * 
		 * DVD
		 * Properties:
		 *	-Movie length
		 *	-Image
		 *	-Size
		 * Functionality:
		 *	-Store
		 *
		 *
		 * Four Pillars of OOP:
		 * 	1. Abstraction
		 * 		examples:  (Generically defined characteristics of same object)
		 * 			Triangle
		 * 			Table
		 * 	2. Encapsulation
		 * 		examples: (Generically defined functionality)
		 * 			Driving a car
		 * 	3. Inheritance
		 * 		examples: 
		 * 			Traits and characteristics and inherited from Parent classes.
		 * 	4. Polymorphism
		 * 		examples: (Abstractions on same functionality)
		 * 			Communication: Dogs bark, cats purr, humans speak, etc.
		 * 
		 * Classes help structure code for ease of use in OOP.
		 * Classes are like blueprints.
		 * Objects are the actual product developed from the blueprint.
		 * An Object is an instance of a class.
		 * 
		 */
package Assignments;

public class Week05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.setFirstName("Sa");
		student1.setLastName("Smith");
		student1.setGradeLevel(11);
		student1.setPhoneNumber("562-555-5555");
		student1.introduce();
		
		Student student2 = new Student("John", "Dixon");
		student2.introduce();
		
		student2.setGradeLevel(9);
		student2.introduce();


	} // End main

} // End of class
