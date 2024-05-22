package Assignments;

public class Player {
	
	private String name;
	private String position;
	private String speciality;
	
	public Player(String name, String position, String speciality) {
		this.name = name;
		this.position = position;
		this.speciality = speciality;
	}
	
	public void describe() {
		System.out.println("Player Name: " + name + "\tPlayer Position: " + position + "\tPlayer Speciality: " + speciality);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpecialty() {
		return speciality;
	}

	public void setSpecialty(String speciality) {
		this.speciality = speciality;
	}

}
