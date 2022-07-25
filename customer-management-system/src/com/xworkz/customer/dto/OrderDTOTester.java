package com.xworkz.customer.dto;

import java.util.Scanner;

public class OrderDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

		OrderDTO order=new OrderDTO();
		System.out.println("Enter the Id ");
		int id=sc.nextInt();
		System.out.println("Enter the price");
		int price=sc.nextInt();
		System.out.println("Enter the personName");
		String personName=sc.next();
		System.out.println("Enter the Address of order");
		String address=sc.next();
		System.out.println("Enter the Number Of Items In The Order");
		int noOfItems=sc.nextInt();
		
		
		order.setId(id);
		order.setPrice(price);
		order.setPersonName(personName);
		order.setAddress(address);
		order.setNoOfItems(noOfItems);
		
		System.out.println(order);
	}

}
