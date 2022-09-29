/**
* Name:	Bryson Davis 
* File: Assignment5\FighterJet.java
* Description:	Assignemnt 5 
*/

import java.util.concurrent.TimeUnit;

public class FighterJet implements AirVehicle, SoundBarrier {
	private int numOfEngines;
	private int crewSize;
	private String jetName;
	private String manufacturerName;
	
	public FighterJet() {}
	
	public FighterJet(int numOfEngines, int crewSize, String jetName, String manufacturerName) {
		this.numOfEngines = numOfEngines;
		this.crewSize = crewSize;
		this.jetName = jetName;
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

	public String getJetName() {
		return jetName;
	}

	public void setJetName(String jetName) {
		this.jetName = jetName;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	public String toString() {
		return "FighterJet [numOfEngines=" + numOfEngines + ", numOfCrewMembers=" + crewSize + ", nameOfPlane=" + jetName +
				", manufacturer=" + manufacturerName + "]";
	}

	@Override
	public void breakSoundBarrier() {
		System.out.println(this.jetName + " broke the sound barrier!");
	}

	@Override
	public void avTakeoff() {
		System.out.print(this.jetName + " has started the takeoff roll.");
		
		for(int i = 0; i < 3; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
		}
		System.out.println();
	}

	@Override
	public void avFly() {
		System.out.print(this.jetName + " has taken off and is now flying." + "\n" + "Flying.");
		
		for(int i = 0; i < 3; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("...");
		}
		System.out.println();
	}

	@Override
	public void avLand() {
		System.out.println(this.jetName + " has successfully landed.");
		
	}
	
}
