/*
 * Author: Samuel Ajao
 * May-08-2024
 * A basic menu app for storing team members.
 */

package Assignments;

import java.util.Scanner;

public class MenuApp {
	
	static Scanner s = new Scanner(System.in);
	static int teamSize = 0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * This App will allow the user to:
		 * *Add a team member at specific position
		 * *View a team member at specific position
		 * *View all team members
		 * *Delete a team member by position
		 * *Delete all team members
		 */
		
		String[] team = new String[5];
		//Scanner s = new Scanner(System.in);
		int decision = 0;
		
		while (decision != -1) {
			showMenu();
			
			decision = s.nextInt();
			
			//performAction(decision);
			
			switch(decision) {
				case(1):
					addMember(team);
					break;
				case(2):
					viewMember(team);
					break;
				case(3):
					viewTeam(team);
					break;
				case(4):
					removeMember(team);
					break;
				case(5):
					deleteTeam(team);
					break;
				case(-1):
					System.out.println("Goodbye.");
					break;
				default:
					System.out.println("Invalid selection.");
			}
		}
		
		s.close();

	}
	
	public static void showMenu() {
		System.out.println("Selection Menu:");
		System.out.println("(1.) Add a team member");
		System.out.println("(2.) View a team member");
		System.out.println("(3.) View all team members");
		System.out.println("(4.) Delete a team member by position");
		System.out.println("(5.) Delete all team members");
		System.out.println("(-1.) Exit");
		System.out.print(":");
		
	}
	
	public static void viewTeam(String[] t) {
		int size = t.length;
		for(int i = 0; i < size; i++) {
			System.out.println(t[i]);
		}
	}
	
	public static void addMember(String[] t) {
		int size = t.length;
		System.out.print("Which place would you like to add the team member? 1-" + size +":");
		int teamNumber = s.nextInt();
		
		if(teamNumber > 0 && teamNumber < 6) {
			System.out.print("Enter team member's name:");
			String memberName = s.next();
			t[teamNumber-1] = memberName;
			teamSize++;
			System.out.println(memberName + " added at position " + teamNumber);
		}
		else {
			System.out.println("******Invalid selection******");
		}
		
		
	}
	
	public static void viewMember(String[] t) {
		int size = t.length;
		System.out.print("Which team member would you like to see? 1-" +size+":");
		int teamNumber = s.nextInt();
		
		if(teamNumber > 0 && teamNumber < 6) {
			System.out.println(t[teamNumber-1]);
		}
		else {
			System.out.println("******Invalid selection******");
		}
		
		
	}
	
	public static void removeMember(String[] t) {
		int size = t.length;
		System.out.print("Which place would you like to remove a team member? 1-" + size +":");
		int teamNumber = s.nextInt();
		
		if(teamNumber > 0 && teamNumber < 6) {
			String memberName = t[teamNumber-1];
			t[teamNumber-1] = "<CLEAR>";
			teamSize--;
			System.out.println(memberName + " removed from position " + teamNumber);
		}
		else {
			System.out.println("******Invalid selection******");
		}
		
		
	}
	
	public static void deleteTeam(String[] t) {
		int size = t.length;
		
		for(int i=0; i<size; i++) {
			t[i] = "<CLEAR>";
		}
		teamSize = 0;
	}

}
