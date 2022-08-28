import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsAccountRunner {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void menuOptions() {
		System.out.println("\n" + "=================");
		System.out.println("= OPTIONS BELOW =");
		System.out.println("=================");
		System.out.println("\n" + "1. Deposit" + "\n" + "2. View Monthly Interest Rate"
		+ "\n" + "3. View Account Details" + "\n" + "4. Exit" + "\n");
		System.out.print("Enter your selection: ");
	}
	
	public static void contProgram(SavingsAccount account) {
		char option;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			menuOptions();
			
			option = input.next().charAt(0);
			
			switch(option) {
				case '1': 
					double amount = 0;
					while(amount <= 0) {
						System.out.print("\n" + "Enter your deposit amount: ");
						amount = input.nextDouble();
						if(amount > 0)
							break;
						System.out.println("\n" + "INVALID AMOUNT - TRY AGAIN!");
					}
					account.deposit(amount);
					System.out.println("\n" + "New Balance: $" + df.format(account.getBalance()));
					break;
				case '2': 
					System.out.println("\n" + "Your Monthly Interest Amount is: $" +
									   df.format(account.getMonthlyIntRate()));
					break;
				case '3':
					System.out.println("\n" + account.toString());
					break;
				case '4':
					System.out.println("\n" + "Thank you - GoodBye!");
					System.exit(0);
					break;
				default:
					System.out.println("\n" + "INVALID SELECTION - TRY AGAIN!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		double balance;
		
		System.out.println("Welcome to your Savings Account App!");
		System.out.print("\n" + "Enter your account nickname: ");
		name = input.nextLine(); 
		
		System.out.print("\n" + "Enter your initial balance: ");
		balance = input.nextDouble();
		
		SavingsAccount account = new SavingsAccount(name, balance);
		
		System.out.print("\n" + "Enter your annual interest rate: ");
		account.setAnnualIntRate(input.nextDouble());
		
		contProgram(account);
	}

}
