import java.util.Scanner;

public class DailyBookInventory {
	static int booksReturned;
	static int booksCheckedOut;
	static int totalOfBooksProcessed;
	
	static void isISBN13() {
		String isbnInput;
		int result;
		Scanner userInput = new Scanner(System.in);
		
		while(true) {
			System.out.print("\n" + "Enter the first 12 digits of an ISBN-13 as a String: ");
			isbnInput = userInput.nextLine();
			
			if(isbnInput.length() > 12 || isbnInput.length() < 12) {
				System.out.print("\n" + "!!!-------------------------------------!!!");
				System.out.print("\n" + "! Invalid number length, please try again !");
				System.out.println("\n" + "!!!-------------------------------------!!!" + "\n");
				continue;
			}
			result = ISBNCalculation(isbnInput);
			
			if(result == 0) {
				isbnInput += result;
				System.out.println("The ISBN-13 number is: " + isbnInput + "\n");
				break;
			} else {
				isbnInput += 10 - result;
				System.out.println("The ISBN-13 number is: " + isbnInput + "\n");
				break;
			}
		}
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
	
	static void processInventory() {
		Scanner userInput = new Scanner(System.in);
		String transaction;
		while(true) {
			System.out.print("Enter 'R' for return or 'C' for check out: ");
			transaction = userInput.nextLine();
			
			if(transaction.equals("R")) {
				booksReturned++;
				break;
			}
			else if(transaction.equals("C")) {
				booksCheckedOut++;
				break;
			}
			else {
				System.out.print("\n" + "!!!-----------------------------!!!");
				System.out.print("\n" + "! Invalid input, please try again !");
				System.out.println("\n" + "!!!-----------------------------!!!" + "\n");
			}
		}
		totalOfBooksProcessed++;
		
		System.out.println("------------------------");
		System.out.println("| Daily Book Inventory |");
		System.out.println("------------------------");
		System.out.println("Number of books returned: " + booksReturned);
		System.out.println("Number of books checked out: " + booksCheckedOut);
		System.out.println("Number of books processed: " + totalOfBooksProcessed);
		System.out.println("------------------------");
		
	}
	
	static void contProgram() {
		Scanner input = new Scanner(System.in);
		String menuAction;
		
		while(true) {
			System.out.print("Enter 'Y' to continue, 'N' to quit: ");
			menuAction = input.nextLine();

			if(menuAction.equals("N")) {
				System.out.println("\n" + "------------------------");
				System.out.println("| Daily Book Inventory |");
				System.out.println("------------------------");
				System.out.println("Number of books returned: " + booksReturned);
				System.out.println("Number of books checked out: " + booksCheckedOut);
				System.out.println("Number of books processed: " + totalOfBooksProcessed);
				System.out.println("------------------------");
				System.exit(0);
			}
			else if(menuAction.equals("Y")) {
				isISBN13();
				processInventory();
			} else {
				System.out.print("\n" + "!!!-----------------------------!!!");
				System.out.print("\n" + "! Invalid input, please try again !");
				System.out.println("\n" + "!!!-----------------------------!!!" + "\n");
			}
		}
	}

	public static void main(String[] args) {
		String menuAction = null;
		
		System.out.println("------------------------------------------------");
		System.out.println("- Welcome to the Daily Book Inventory Program! -");
		System.out.println("------------------------------------------------");
		
		isISBN13();
		processInventory();
		contProgram();
	}
}
