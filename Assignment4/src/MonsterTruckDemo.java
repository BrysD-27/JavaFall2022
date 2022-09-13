/**
* Name:	Bryson Davis 
* File: Assignment4\MonsterTruckDemo.java
* Description:	Assignemnt 4 
*/

public class MonsterTruckDemo {
	
	public static String printTruckHeader(String truckNum) {
		return "##########################" + "\n" +
			   "# MONSTER TRUCK " + truckNum + " INFO #" + "\n" +
			   "##########################" + "\n";
	}

	public static void main(String[] args) {
		MonsterTruck monsterTruckOne = new MonsterTruck();
		monsterTruckOne.setName("Grave Digger");
		monsterTruckOne.setColor("Black");
		monsterTruckOne.setPower("Gasoline");
		monsterTruckOne.setYear(2021);
		monsterTruckOne.setWins(20);
		monsterTruckOne.setLosses(10);
		monsterTruckOne.setTrick("Big Air");
		
		System.out.println(printTruckHeader("ONE"));
		System.out.println(monsterTruckOne.toString());
		
		MonsterTruck monsterTruckTwo = new MonsterTruck("Max D", "Silver", "Gasoline", 2022, 10, 2, "Backflip");
		
		System.out.println(printTruckHeader("TWO"));
		
		System.out.println(monsterTruckTwo.toString());
	}

}
