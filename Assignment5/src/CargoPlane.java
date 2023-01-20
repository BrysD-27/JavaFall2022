/**
* Name:	Bryson Davis 
* File: Assignment5\CargoPlane.java
* Description:	Assignemnt 5 
*/

import java.util.concurrent.TimeUnit;

public class CargoPlane implements AirVehicle {
	private int numOfEngines;
	private int crewSize;
	private String planeName;
	private String manufacturerName;
		
	public CargoPlane() {}
	
	public CargoPlane(int numOfEngines, int crewSize, String planeName, String manufacturerName) {
		this.numOfEngines = numOfEngines;
		this.crewSize = crewSize;
		this.planeName = planeName;
		this.manufacturerName = manufacturerName;
	}

	public int getNumOfEngines() {
		return numOfEngines;
	}

	public void setNumOfEngines(int numOfEngines) {
		this.numOfEngines = numOfEngines;
	}

	public int getCrewSize() {
		return crewSize;
	}

	public void setCrewSize(int crewSize) {
		this.crewSize = crewSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	public String toString() {
		return "FighterJet [numOfEngines=" + numOfEngines + ", numOfCrewMembers=" + crewSize + ", nameOfPlane=" + planeName +
				", manufacturer=" + manufacturerName + "]";
	}

//	@Override
	public void avTakeoff() {
		System.out.print(this.planeName + " has started the takeoff roll.");
		
		for(int i = 0; i < 4; i++) {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
		}
		System.out.println();
	}

	@Override
	public void avFly() {
		System.out.print(this.planeName + " has taken off and is now flying" + "\n" + "Flying.");
		
		for(int i = 0; i < 4; i++) {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
		}
		System.out.println();
	}

	@Override
	public void avLand() {
		System.out.println(this.planeName + " has successfully landed.");
		
	}
}
