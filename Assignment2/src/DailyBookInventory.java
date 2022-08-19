import java.util.Scanner;

public class DailyBookInventory {
	
	static String isISBN13(String number) {
		int result = ISBNCalculation(number);
		
		if(result == 0) {
			number += result;
			System.out.println("\n" + "The ISBN number is " + number);
			return number;
		} else {
			number += 10 - result;
			System.out.println("\n" + "The ISBN number is " + number);
			result = ISBNCalculation(number);
		}
		if(result == 0) {
			System.out.println("\n" + "The ISBN number is " + number);
			return number;
		}
		
		return number;
	}
	
	static int ISBNCalculation(String number) {
		int sum = 0;
		int multiply;
		int digit;
		
		for(int i = 1; i <= 12; i++) {
			if(i % 2 == 0)
				multiply = 3;
			else 
				multiply = 1;
			
			digit = Character.getNumericValue(number.charAt(i - 1));
			
			sum += (multiply * digit);
		}
		
		return sum % 10;
	}
	
	static String checkInputLength(String input) {
		Scanner userInput = new Scanner(System.in);
		while(input.length() > 12 || input.length() < 12) {
			
			System.out.print("\n" + "!!!-----------------------------!!!");
			System.out.print("\n" + "! Invalid input, please try again !");
			System.out.print("\n" + "!!!-----------------------------!!!" + "\n");
			
			System.out.print("\n" + "Enter the first 12 digits of an ISBN-13 as a String: ");
			input = userInput.nextLine();
		}
		
		return input;
	}
	
	static void contProgram(String menuAction) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter 'Y' to continue, 'N' to quit: ");
			menuAction = input.nextLine();

			if(menuAction.equals("N")) {
				System.exit(0);
			}
			else if(menuAction.equals("Y")) {
				System.out.print("\n" + "Enter the first 12 digits of an ISBN-13 as a String: ");
				menuAction = checkInputLength(input.nextLine());
				menuAction = isISBN13(menuAction);
			} else {
				System.out.print("\n" + "!!!-----------------------------!!!");
				System.out.print("\n" + "! Invalid input, please try again !");
				System.out.println("\n" + "!!!-----------------------------!!!" + "\n");
			}
		}
	}

	public static void main(String[] args) {
		String menuAction;
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------------------------------------------");
		System.out.println("- Welcome to the Daily Book Inventory Program! -");
		System.out.println("------------------------------------------------");
		
		System.out.print("\n" + "Enter the first 12 digits of an ISBN-13 as a String: ");
		menuAction = checkInputLength(input.nextLine());
		
		menuAction = isISBN13(menuAction);
		
		contProgram(menuAction);
	}

}
