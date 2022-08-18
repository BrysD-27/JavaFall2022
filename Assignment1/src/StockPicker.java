/**
 * Author:	Bryson Davis
 * Date:	08/18/22
 * File:	Assginment1
 * Description:	Investment Stock Selector
 */

import java.util.Scanner;

public class StockPicker {
	public static void main(String[] args) {
		double investmentMoney;
		String stockTicker;
		double stockPrice;
		double peRatio;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Stock Picker App!" + "\n");		
		
		System.out.print("Enter the total amount of money you are willing to invest: ");
		investmentMoney = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter stock ticker: ");
		stockTicker = input.nextLine();
		
		while(stockTicker.length() > 5) {
			System.out.print("Invalid input. Please try again: ");
			stockTicker = input.nextLine();
		}
		
		System.out.print("Enter the price: $");
		stockPrice = input.nextDouble();
		
		while(stockPrice <= 0) {
			System.out.print("Invalid price. Please try again: $");
			stockPrice = input.nextDouble();
		}
		
		System.out.print("Enter the P/E Ratio: ");
		peRatio = input.nextDouble();
		
		input.close();
		
		System.out.println("\n" +"Below are your results: ");
		System.out.print("\n");
		System.out.println("Stock: " + stockTicker);
		System.out.printf("Price: $" + "%.2f", stockPrice);
		System.out.println("\n" + "P/E Ratio: " + peRatio);
		if(peRatio > 60)
			System.out.println("WARNING: This company may be overvalued!");
		System.out.println("# of shares able to purchase: " + String.format("%.0f",(investmentMoney / stockPrice)));
	}	
	
}
