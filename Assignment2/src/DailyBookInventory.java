import java.util.Scanner;

public class DailyBookInventory {

	public static void main(String[] args) {
		String menuAction;
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to the Daily Book Inventory Program!");
		System.out.println("--------------------------------------------");
		
		do {
			System.out.print("\n" + "Enter the first 12 digits of an ISBN-13 as a String: ");
			menuAction = input.nextLine();
			
			switch(menuAction) {
			case "N":
				System.out.println("\n" + "Thanks, come again!");
				System.exit(0);
			case "Y":
				continue;
			}
			
			if(menuAction.length() > 12 || menuAction.length() < 12) {
				System.out.print("\n" + "!!!--------------------------!!!");
				System.out.print("\n" + "Invalid input, please try again!");
				System.out.print("\n" + "!!!--------------------------!!!" + "\n");
				continue;
			}
			
		} while(true);
		
	}

}
