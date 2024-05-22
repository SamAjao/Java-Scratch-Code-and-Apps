package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private List<Player>  players= new ArrayList<Player>();
	
	private String teamName;

	public Team(String teamName) {
		this.setTeamName(teamName);
	}
	
	public void describe() {
		System.out.println("Team Name: " + teamName);
		for(Player p : players) {
			p.describe();
		}
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void deletePlayer(String playerName) {
		for(Player p : players) {
			if(p.getName().equals(playerName)) {
				players.remove(p);
			}
		}
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	


}
