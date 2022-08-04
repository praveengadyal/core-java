package com.xworkz.atm;

import java.util.Scanner;

public class ATMTester {

	public static void main(String[] args) {
		System.out.println("main method started.....");
		
		
		Scanner sc=new Scanner(System.in);
		try {
			
		System.out.println("Enter the cardName");
		String cardName=sc.next();
		System.out.println("Enter the card balance");
	    double balance=sc.nextDouble();
	    ATMCard card=new ATMCard(cardName,balance);
	    
		System.out.println("Enter the ATM Name");
		String name=sc.next();
		System.out.println("enter the Amount to be withdraw");
	    double amount=sc.nextDouble();

		
	    try {
			ATM1 atm=new ATM1(name);
			
			atm.withDrawal(card, amount);
		}
		 catch (ExceedingAmountLimitException  |IllegalArgumentExpection | NotEnoughMoneyInYourAccountException | IllegalDenominationException | NeagtiveAmountException  e )
	    {
			
			e.printStackTrace();
			System.out.println("catching exceptions......");
		}
		
		}catch(Exception  ee) {
			ee.printStackTrace();
			
		}

		
	}
}
