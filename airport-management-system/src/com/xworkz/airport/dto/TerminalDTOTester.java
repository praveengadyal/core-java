package com.xworkz.airport.dto;

import java.util.Scanner;

public class TerminalDTOTester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
  TerminalDTO terminal=new TerminalDTO();
  System.out.println("enter the Id");
  int id=sc.nextInt();
  System.out.println("Enter the TerminalName");
  String terminalName=sc.next();
  System.out.println("Enter the Number of terminals");
  int noOfTerminal=sc.nextInt();
  System.out.println("Enter the Type of Terminal");
  String type=sc.next();
  
  
  terminal.setId(id);
  terminal.setNoOfTerminal(noOfTerminal);
  terminal.setTerminalName(terminalName);
  terminal.setType(type);
  
  System.out.println(terminal);
	}

}
