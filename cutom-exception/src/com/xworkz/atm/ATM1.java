package com.xworkz.atm;

public class ATM1 {
	
	
 static final double amonutLimit=10000;
	
	public  ATM1(String name) throws IllegalArgumentExpection 
	{
		if(!(name==null || name.trim().equals(""))) {
			System.out.println("proceed....");
		}else {
			throw new IllegalArgumentExpection("ATM Name should not be null or empty.......");
		}
	 }
	
	public void withDrawal(ATMCard card,double amount) throws ExceedingAmountLimitException, NotEnoughMoneyInYourAccountException, NeagtiveAmountException, IllegalDenominationException
	{
		System.out.println("withdrawal method started...");
		
		if(card==null)
			throw new IllegalArgumentExpection("ATM Name should not be null or empty.......");
		if(amount<0)
			throw new NeagtiveAmountException("Insufficient balance ......invalid amount... ");
		if(amount>=ATM.amonutLimit)
			 throw new ExceedingAmountLimitException("your exceeding the limit......"); 
		if(amount>card.balance)
			throw new NotEnoughMoneyInYourAccountException("Insufficient balance ......invalid amount... ");
		if(amount%100!=0)
			throw new IllegalDenominationException("plz enter amount in multiples of 100.....");
		
		else {
			 System.out.println("withdraw amount...");
				System.out.println( card.balance=card.balance-amount);
		}
		
	
		System.out.println("withDrawal method ended..."); 
	}
	


}


