/*
 * Student: Samuel Ajao
 * 
 * Access modifiers:
 * 	public - Accessible anywhere
 * 	private - Only accessible within the 'Class' itself.
 * 	protected - Accessible only within the 'Class', other classes in the same package,
 * 			and all subclasses.
 * 	No Modifier - Same as protected EXCEPT it is not accessible in the subclass in a
 * 		different package.
 * 
 * Use access modifiers to hide data a publicize methods.
 * 'Getters' (Accessors) and 'Setters' (Mutators) allow users to view and change data.
 * 
 */
package Assignments;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		
		System.out.println(rec.getArea());
		
		rec.setLength(10);
		
		System.out.println(rec.getArea());
		
		

	}

}
