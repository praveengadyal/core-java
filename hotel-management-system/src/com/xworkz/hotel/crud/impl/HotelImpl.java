package com.xworkz.hotel.crud.impl;

import com.xworkz.hotel.crud.Hotel;
import com.xworkz.hotel.dto.FoodItemDTO;

import java.util.Arrays;
public class HotelImpl implements Hotel {
	
			


	 FoodItemDTO[] dtos;
	 int i;

	 public HotelImpl(int size){
	 dtos=new FoodItemDTO[size];
	 System.out.println("inside the Hotel const...........");
	 }

	 @Override	 
	 public boolean creatFoodItems(FoodItemDTO dto){
	 System.out.println("inside the creatFoodItems method.....");
	 boolean isAdded=false;
	 if(dto!=null && dto.getName()!=null){
	 this.dtos[i++]=dto;
	 isAdded=true;
	 System.out.println("FoodItems  added succesfully...");
	 }
	 else{
	   System.out.println("no FoodItems added...");
	 }
	 return isAdded;
	 }

	 @Override
	 public void getFoodItemsDetails(){
	 System.out.println("inside getFoodItems deatils method");

	 for(int i=0;i<dtos.length;i++){
	  System.out.println(dtos[i]);
	 }								
	 }

	 @Override
	 public FoodItemDTO getFoodItemsDetailsByName(String name){
	 System.out.println("inside getFoodItemsDetailsByName()");
	 FoodItemDTO foodItemsDTO=null;
	 for(int i=0;i<dtos.length;i++){
	 if(dtos[i].getName().equals(name)){
	 System.out.println(foodItemsDTO=dtos[i]);
	 }
	 }
	 return foodItemsDTO;
	 }

	 @Override
	 public String[] getAllFoodItemName(){
	 System.out.println("inside getAllFoodItemName()");
	 int i,j;
	 for(j=0,i=0;i<dtos.length;i++){
	 System.out.println(dtos[i].getName());
	 j++;
	 }

	 String[] allFoodName=new String[j];
	 for(int k=0,l=0;k<dtos.length;k++){
	  allFoodName[l++]=dtos[k].getName();
	 }
	 return allFoodName;
	 }


	 @Override
	 public boolean updateFoodItemsPriceByName(String name,int price){
	 System.out.println("inside updateFoodItemsPriceByName()");
	 boolean updatePrice=false;
	 for(int i=0;i<dtos.length;i++){
	    if (dtos[i].getName().equals(name)){
	          dtos[i].setPrice(price);
	          updatePrice=true;
	 }
	 else{
	 System.out.println("no FoodItem with this name....plz make sure you provide correct name");
	 }
	 }
	 return updatePrice;
	 }


	 @Override
	 public boolean deleteFoodItemByType(String type){
	 System.out.println("inside deleteFoodItemByType()");
	 boolean foodItemDeleted=false;
	 int i,j;
	 for(i=0,j=0;j<dtos.length;j++){
	 if(!dtos[j].getType().equals(type)){
	    dtos[i++]=dtos[j];
	    foodItemDeleted=true;
	 }else{
	 System.out.println("provide propare information Fooditem not deleted");
	 }
	 }
	 dtos=Arrays.copyOf(dtos,i);
	 return foodItemDeleted;
	 }


	 @Override
	 public  boolean updateFoodItemsPriceById(int id,int price){
	 System.out.println("inside updateFoodItemsPriceById()");
	 boolean updatePrice=false;
	 for(int i=0;i<dtos.length;i++){
	     if(dtos[i].getId()==id){
	         dtos[i].setPrice(price);
	          updatePrice=true;
	 }
	 else{
	    System.out.println("No FoodItem with this id ....plz make sure that you have propare id");
	 }
	 }
	 return updatePrice;
	 }


	 @Override
	 public boolean updateFoodItemTypeByName(String name,String type){
	 System.out.println("inside updateFoodItemTypeByName()");
	 boolean updateType=false;
	 for(int i=0;i<dtos.length;i++){
	    if (dtos[i].getName().equals(name)){
	          dtos[i].setType(type);
	          updateType=true;
	 }
	 else{
	 System.out.println("no FoodItem with this name....plz make sure you provide correct name");
	 }
	 }
	 return updateType;
	 }



	 @Override
	 public boolean deleteFoodItemById(int id){
	 System.out.println("inside deleteFoodItemById()");
	 boolean foodItemDeleted=false;
	 int i,j;
	 for(i=0,j=0;j<dtos.length;j++){
	 if(dtos[j].getId()!=id){
	 dtos[i++]=dtos[j];
	 foodItemDeleted=true;
	 }else{
	 System.out.println("no foodItem is deleted ..plz see what happened");
	 }
	 }
	 dtos=Arrays.copyOf(dtos,i);
	 return foodItemDeleted;
	 }


	 @Override
	 public boolean deleteFoodItemByName(String name){
	 System.out.println("inside deleteFoodItemByName()");
	 boolean foodItemDeleted=false;
	 int i,j;
	 for(i=0,j=0;j<dtos.length;j++){
	 if(!dtos[j].getName().equals(name)){
	    dtos[i++]=dtos[j];
	    foodItemDeleted=true;
	 }else{
	 System.out.println("provide propare information Fooditem not deleted");
	 }
	 }
	 dtos=Arrays.copyOf(dtos,i);
	 return foodItemDeleted;
	 }



	 }





