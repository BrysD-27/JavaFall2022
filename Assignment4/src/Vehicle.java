/**
* Name:	Bryson Davis 
* File: Assignment4\Vehicle.java
* Description:	Assignemnt 4 
*/

public class Vehicle {
	private String name;
	private String color;
	private String power;
	private int year;
	
	public Vehicle() {}
	
	public Vehicle(String name, String color, String power, int year) {
		this.name = name;
		this.color = color;
		this.power = power;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getPower() {
		return power;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Name: " + name + "\n" +
			   "Color: " + color + "\n" +
			   "Power: " + power + "\n" +
			   "Year: " + year + "\n";
	}
}
