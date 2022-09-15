/**
* Name:	Bryson Davis 
* File: Assignment4\MonsterTruckDemogit.java
* Description:	Assignemnt 4 
*/

public class MonsterTruckDemo {
	
	public static String printTruckHeader(String truckNum) {
		return "##########################" + "\n" +
			   "# MONSTER TRUCK " + truckNum + " INFO #" + "\n" +
			   "##########################" + "\n";
	}

	public static void main(String[] args) {
		
		// Monster Truck One
		MonsterTruck monsterTruckOne = new MonsterTruck();
		monsterTruckOne.setName("Grave Digger");
		monsterTruckOne.setColor("Black");
		monsterTruckOne.setPower("Gasoline");
		monsterTruckOne.setYear(2021);
		monsterTruckOne.setWins(20);
		monsterTruckOne.setLosses(10);
		monsterTruckOne.setTrick("Big Air");
		
		System.out.println(printTruckHeader("ONE"));
		System.out.println("Name: " + monsterTruckOne.getName());
		System.out.println("Color: " + monsterTruckOne.getColor());
		System.out.println("Power: " + monsterTruckOne.getPower());
		System.out.println("Year: " + monsterTruckOne.getYear());
		System.out.println("# Wins: " + monsterTruckOne.getWins());
		System.out.println("# Losses: " + monsterTruckOne.getLosses());
		System.out.println("Special Trick: " + monsterTruckOne.getTrick());
		System.out.println("Win Percentage: " + monsterTruckOne.getWinPercentage() + "\n");

		// Monster Truck Two
		
		MonsterTruck monsterTruckTwo = new MonsterTruck("Max D", "Silver", "Gasoline", 2022, 10, 2, "Backflip");
		
		System.out.println(printTruckHeader("TWO"));
		
		System.out.println(monsterTruckTwo.toString());
	}

}
