package com.coforge.day4.Handson;

import java.util.Scanner;

public class BankAccount {
	private int accountNumber;
	private int balance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount) {
		int tempBalance = getBalance();
		tempBalance += amount; 
		setBalance(tempBalance);
		System.out.println(amount + " Deposited\n");
	}
	public void withdraw(int amount) {
		int tempBalance = getBalance();
		tempBalance -= amount; 
		setBalance(tempBalance);
		System.out.println("Succesfully Withdrawn\n");		
	}
	public void checkBalance() {
		System.out.println("Your Balance is : \n" + getBalance());
	}
	public static void main(String args[]) {
		BankAccount bankAccount = new BankAccount(102,10000);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Please Choose on of these Options\n"
				+ "1.Deposit\n"
				+ "2.Withdraw\n"
				+ "3.Check Balance\n"
				+ "4.Exit");
		   choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Amount to be Deposited");
			int tempDeposit = sc.nextInt();
			bankAccount.deposit(tempDeposit);
			break;
		case 2:
			System.out.println("Enter the Amount to be Withdrawn");
			int tempWithdraw = sc.nextInt();
			bankAccount.withdraw(tempWithdraw);
			break;
		case 3:
			bankAccount.checkBalance();
			break;
		case 4:
			System.out.println("Exited");
			break;
		default:
			System.out.println("Please Enter  a Valid Choice \n");
			
		}
  }while(choice != 4);
		sc.close();
 }
}
