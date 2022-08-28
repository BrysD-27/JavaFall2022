import java.text.DecimalFormat;
import java.util.Date;

public class SavingsAccount {
	private String nickname;
	private double balance;
	private double annualIntRate;
	private double monthlyIntRate;
	private Date dateEstablished = new Date();
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public SavingsAccount() {}
	
	public SavingsAccount(String nickname, double initialBalance) {
		this.nickname = nickname;
		this.balance = initialBalance;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String name) {
		this.nickname = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public double getAnnualIntRate() {
		return annualIntRate;
	}
	
	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate; 
	}
	
	public Date getDateEstablished() {
		return dateEstablished;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double getMonthlyIntRate() {
		double monthlyIntRate = ((annualIntRate / 100) / 12) * balance;
		
		return monthlyIntRate;
	}
	
	public String toString() {
		return "Account Nickname: " + nickname + "\n"
				+ "Account Creation Date/Time: " + dateEstablished + "\n"
				+ "Balance: $" + balance + "\n"
				+ "Monthly Interest Rate: $" + df.format(getMonthlyIntRate()) + "\n";
	}
}
       