package com.xworkz.hotel.crud;

import com.xworkz.hotel.dto.FoodItemDTO;

public interface Hotel {



		public boolean creatFoodItems(FoodItemDTO dto);

		public void getFoodItemsDetails();

		public FoodItemDTO getFoodItemsDetailsByName(String name);

		public String[] getAllFoodItemName();

		public boolean updateFoodItemsPriceByName(String name,int price);

		public boolean deleteFoodItemByType(String type);

		public  boolean updateFoodItemsPriceById(int id,int price);

		public boolean updateFoodItemTypeByName(String name,String type);

		public boolean deleteFoodItemById(int id);

		public boolean deleteFoodItemByName(String name);


		}
	


