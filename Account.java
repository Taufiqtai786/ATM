//Taufiq Tai

package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account { //Make account class
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); //format
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {//get the customerNumber
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {//set the customerPinNumber
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() { // get customer PinNumber
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calsSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposite(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposite(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	// calculation of the checkingWithdraw 
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance Cannot be Nagative." + "\n");
		}
	}
	//calculation of the savingWithraw 
	public void getsavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calsSavingWithdraw(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	//calculation of the checkingDeposite
	public void getCheckingDepositeInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposite(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	//calculation of the SavingDeposite 
	public void getSavingDepositeInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from Saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposite(amount);
			System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
}
