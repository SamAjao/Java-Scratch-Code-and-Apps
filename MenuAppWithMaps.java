/*
 * Author: Samuel Ajao
 * May-11-2024
 * A Map implemented phonebook for storing numbers and people.
 */
package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuAppWithMaps {
	
	static Scanner scanner = new Scanner(System.in);
	static Map<String,String> phonebook = new HashMap<String,String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		
		while(choice != 4) {
			showMenu();
			
			choice = scanner.nextInt();
			
			switch(choice) {
			case(1):
				phonebook = addMember(phonebook);
				break;
			case(2):
				removeMember(phonebook);
				break;
			case(3):
				viewMembers(phonebook);
				break;
			case(4):
				System.out.println("Goodbye.");
				break;
			default:
				System.out.println("Invalid selection.");
			} //End Switch
			
		} //End While
		
		
		
		

	} //End Main
	
//------------------------------------------METHODS BEGIN-------------------------------------------------------------------------------
	
	public static void showMenu() {
		System.out.println("Selection Menu:");
		System.out.println("(1.) Add a contact");
		System.out.println("(2.) Remove a contact");
		System.out.println("(3.) View contacts");
		System.out.println("(4.) Exit");
		System.out.print(":");
		
	}
	
	
	public static Map<String,String> addMember(Map<String,String> contactMap) {
		
		Map<String,String> cpyMap = new HashMap<String,String>(contactMap);
		StringBuilder fName = new StringBuilder();
		StringBuilder lName = new StringBuilder();
		StringBuilder name = new StringBuilder();
		StringBuilder email = new StringBuilder();
		
		
		System.out.print("Contact Email: ");
		email.append(scanner.next().toString());
		
		System.out.print("Contact First Name: ");
		fName.append(scanner.next().toString());
		
		System.out.print("Contact Last Name: ");
		lName.append(scanner.next().toString());
		
		name.append(fName.toString() + " " + lName.toString());
		
		
		
		if(cpyMap.containsKey(email.toString())) {
			System.out.println("That Email already exists.");
		}
		else {
			cpyMap.put(email.toString(), name.toString());
			System.out.println(cpyMap);
			contactMap = cpyMap;
			System.out.println(contactMap);
		}
		
		return cpyMap;
		
		
	}
	
	public static void removeMember(Map<String,String> contactMap) {
		Map<String,String> cpyMap = new HashMap<String,String>(contactMap);
		StringBuilder name = new StringBuilder();
		StringBuilder email = new StringBuilder();
	}
	
	
	public static void viewMembers(Map<String, String> contactMap) {
		
		Map<String,String> cpyMap = new HashMap<String,String>(contactMap);
		int i =0;
		
		System.out.println(cpyMap);
		
		/*for(Map.Entry<String, String> mp : cpyMap.entrySet()) {	
			System.out.println(i+1 + ": " + mp.getValue());
			i++;
		}
		*/
		
		
	}
	
	
	
	
	
//

} //End Class
