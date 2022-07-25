package com.xworkz.hotel;

import java.util.Scanner;

import com.xworkz.hotel.crud.impl.HotelImpl;
import com.xworkz.hotel.dto.FoodItemDTO;

public class HotelImplTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	

		Scanner sc=new Scanner(System.in);
		System.out.println("enter thee number of FoodItems to be Added");
		int size=sc.nextInt();

		HotelImpl h=new HotelImpl(size);


		for(int i=0;i<size;i++){

		FoodItemDTO dto=new FoodItemDTO();
		System.out.println("enter the FoodItem id");
		int id=sc.nextInt();
		System.out.println("enter the FoodItems name");
		String name=sc.next();
		System.out.println("enter the FoodItems Price");
		int price=sc.nextInt();
		System.out.println("enter the FoodItems is type");
		String type=sc.next();

		dto.setId(id);
		dto.setName(name);
		dto.setPrice(price);
		dto.setType(type);
		h.creatFoodItems(dto);
		}

		String option=null;


		do{

		System.out.println("enter the 1 to getFoodItemsDetails.....");
		System.out.println("enter the 2 to getFoodItemsDetailsByName.....");
		System.out.println("enter the 3 to getAllFoodItemName.....");
		System.out.println("enter the 4 to updateFoodItemsPriceById.....");
		System.out.println("enter the 5 to updateFoodItemTypeByName.....");
		System.out.println("enter the 6 to updateFoodItemsPriceByName.....");
		System.out.println("enter the 7 to deleteFoodItemById.....");
		System.out.println("enter the 8 to deleteFoodItemByName.....");
		System.out.println("enter the 9 to deleteFoodItemByType.....");
		System.out.println("enter the number to perform above metioned task...");
		int choice=sc.nextInt();

		switch(choice){

		case 1:h.getFoodItemsDetails();
		break;

		case 2: System.out.println("enter the name of foodItem So that you get Full Detail.....");
		String name=sc.next();
		h.getFoodItemsDetailsByName(name);
		break;

		case 3: h.getAllFoodItemName();
		break;

		case 4: System.out.println("provide the id with which you want to update.....");
		int id1=sc.nextInt();
		System.out.println("enter the updated price...");
		int price1=sc.nextInt();
		h.updateFoodItemsPriceById(id1,price1);
		h.getFoodItemsDetails();
		break;

		case 5:System.out.println("provide the name with which you want to update.....");
		String name1=sc.next();
		System.out.println("enter the updated type....");
		String type1=sc.next();
		h.updateFoodItemTypeByName(name1,type1);
		h.getFoodItemsDetails();
		break;

		case 6:System.out.println("provide name with which you want to update .....");
		String exName=sc.next();
		System.out.println("enter the new price");
		int exPrice=sc.nextInt();
		h.updateFoodItemsPriceByName(exName,exPrice);
		h.getFoodItemsDetails();
		break;

		case 7: System.out.println("enter the FoodItemId with which you want to delete object");
		int id=sc.nextInt();
		h.deleteFoodItemById(id);
		h.getFoodItemsDetails();

		break;


		case 8: System.out.println("enter the FoodItemName with which you want to delete object");
		String namex=sc.next();
		h.deleteFoodItemByName(namex);
		h.getFoodItemsDetails();

		break;

		case 9: System.out.println("enter the foodType with which you want to delete.....");
		String exType=sc.next();
		h.deleteFoodItemByType(exType);
		h.getFoodItemsDetails();
		break;
		 
		default : System.out.println("invalid number ....provide propare number");
		break;


		}
		System.out.println("enter---- yes to continue and no to exit");
		option=sc.next();


		}while(option.equals("yes"));

		}
		
	}


