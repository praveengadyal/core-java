package com.xworkz.hotel.dto;

import java.util.Scanner;

public class FoodItemDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		FoodItemDTO fi=new FoodItemDTO();
		
		System.out.println("Enter the Id");
		int id=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the price");
		int price=sc.nextInt();
		System.out.println("Enter the type");
		String type=sc.next();
		
		fi.setId(id);
		fi.setName(name);
		fi.setPrice(price);
		fi.setType(type);
		
		System.out.println(fi);
	}

}
