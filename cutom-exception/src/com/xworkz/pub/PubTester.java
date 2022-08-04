package com.xworkz.pub;

import java.util.Scanner;

public class PubTester {

	public static void main(String[] args) {
		
		
		System.out.println("main method started.....");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age..");
        int age=sc.nextInt();
        
        Bouncer bouncer=new Bouncer();
        try 
        {
        	bouncer.check(age);
        }catch(PubException pe) {
        	pe.printStackTrace();
        	//pe.getMessage();
        }
      
        System.out.println("main method ended....");
	}

}
