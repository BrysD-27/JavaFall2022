/**
* Name:	Bryson Davis 
* File: Assignment4\MonsterTruck.java
* Description:	Assignemnt 4 
*/

import java.text.DecimalFormat;

public class MonsterTruck extends Vehicle {
	private int numOfWins;
	private int numOfLosses;
	private String specialTrick;
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public MonsterTruck() {}
	
	public MonsterTruck(String name, String color, String power, int year, int numOfWins, int numOfLosses, String specialTrick) {
		super(name, color, power, year);
		this.numOfWins = numOfWins;
		this.numOfLosses = numOfLosses;
		this.specialTrick = specialTrick;
	}
	
	public int getWins() {
		return this.numOfWins;
	}
	
	public int getLosses() {
		return this.numOfLosses;
	}
	
	public String getTrick() {
		return this.specialTrick;
	}
	
	public void setWins(int wins) {
		this.numOfWins = wins;
	}
	
	public void setLosses(int losses) {
		this.numOfLosses = losses;
	}
	
	public void setTrick(String trick) {
		this.specialTrick = trick;
	}
	
	public String toString() {
		int numOfGames = numOfWins + numOfLosses;
		double winPercentage = (double)numOfWins / (double)numOfGames * 100;
		
		return super.toString() +
			   "# Wins: " + numOfWins + "\n" + 
			   "# Losses: " + numOfLosses + "\n" +
			   "Special Trick: " + specialTrick + "\n" +
			   "Win Percentage: " + df.format(winPercentage) + "%" + "\n";
	}
}
