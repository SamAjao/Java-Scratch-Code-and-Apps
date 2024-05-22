package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>();

	public static void main(String[] args) {
		System.out.println("Team Menu App");
		
		Player p1 = new Player("Thomas", "Full Back", "Running Fast");
		Player p2 = new Player("Sally", "Quarterback", "Lacing IT");
		
		Team team1 = new Team("Chargers");
		
		team1.addPlayer(p1);
		team1.addPlayer(p2);
		
		team1.describe();
		
		team1.deletePlayer("Thomas");
		team1.describe();
		
		int selection = -1;
		
		while(selection != 0) {
			
			printOptions();
			
			selection = scanner.nextInt();
			
			switch (selection){
			case 1:
				teams.add(createNewTeam());
				break;
			case 2:
				addPlayerToTeam();
				break;
			case 3:
				removePlayerFromTeam();
				break;
			case 4:
				describeTeam();
				break;
			case 0:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println(":::Invalid Selection:::");
			
			}
			
		}
		
		

	}// End Main
	
	
	private static void printOptions() {
		System.out.println("Options:");
		System.out.println("1: Create a new team.");
		System.out.println("2: Add a player to a team.");
		System.out.println("3: Remove a player from a team");
		System.out.println("4: Describe a team");
		System.out.println("0: Exit");
	}
	
	public static void describeTeam() {
		printTeamNames();
		System.out.print("Which team would you like to see described? ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		
	}
	
	private static Team createNewTeam() {
		System.out.print("Enter the name of the team you want to create: ");
		String name  = scanner.next();
		return new Team(name);
	}
	
	private static void addPlayerToTeam() {
		printTeamNames();
		System.out.println("Enter the name of the team you wish to add a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}	
		
	}
	
	
	private static void removePlayerFromTeam() {
		printTeamNames();
		System.out.println("Enter the name of the team you wish to remove a player from: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
			System.out.print("Which player would you like to remove?");
			String playerName = scanner.next();
			foundTeam.deletePlayer(playerName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}

		
		
		
	}
	
	
	private static Player createNewPlayer() {
		System.out.print("Enter player name: ");
		String name = scanner.next();
		System.out.print("Enter player position: ");
		String position = scanner.next();
		System.out.print("Enter player speciality: ");
		String speciality = scanner.next();
		return new Player(name, position, speciality);
	}
	
	
	private static void printTeamNames() {
		for (Team t : teams) {
			System.out.println(t.getTeamName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception {
		for(Team t : teams) {
			if(t.getTeamName().equals(name)) {
				return t;
			}
		}
		throw new Exception("Team Not Found: " + name);
	}

} //End TeamMenuApp Class
