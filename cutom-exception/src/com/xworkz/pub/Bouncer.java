package com.xworkz.pub;

public class Bouncer {

	public void check(int age) throws PubException
	{
		System.out.println("check method started......");
		
		if (age >= 18) 
		{
			System.out.println("please enter .... and Enjoy your night....");
		}
		else 
		{
			throw new PubException();
		}
		
		System.out.println("check method ended....");
	}

}
