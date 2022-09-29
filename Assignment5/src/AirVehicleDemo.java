/**
* Name:	Bryson Davis 
* File: Assignment5\AirVehicleDemo.java
* Description:	Assignemnt 5 
*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AirVehicleDemo {
	
	public static void promptPilot() {
		Scanner input = new Scanner(System.in);
		String userInput;
		
		System.out.print("Ready for takeoff? (y/n): ");
		userInput = input.nextLine();
		
		while(userInput.toLowerCase().equals("n")) {
			System.out.println("Pilot will prompted again in 5 seconds.");
			System.out.println("Please ensure takeoff prepartions are complete.");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("Ready for takeoff? (y/n): ");
			userInput = input.nextLine();
		}
		

	}

	public static void main(String[] args) {
		
		FighterJet f22 = new FighterJet(2, 1, "F-22", "Lockheed Martin");
		CargoPlane c17 = new CargoPlane(4, 3, "C-17", "Boeing");
		System.out.println("###################");
		System.out.println("# FighterJet Info #");
		System.out.println(f22.toString() + "\n");
		
		promptPilot();
		
		f22.avTakeoff();
		f22.avFly();
		f22.breakSoundBarrier();
		f22.avLand();
		
		System.out.println("\n" + "###################");
		System.out.println("# CargoPlane Info #");
		System.out.println(c17.toString() + "\n");
		
		promptPilot();
		
		c17.avTakeoff();
		c17.avFly();
		c17.avLand();
		
	}

}
