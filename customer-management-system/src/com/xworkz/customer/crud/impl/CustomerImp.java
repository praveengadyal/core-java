package com.xworkz.customer.crud.impl;
import java.util.Arrays;

import com.xworkz.customer.crud.Customer;
import com.xworkz.customer.dto.OrderDTO;
public class CustomerImp implements Customer{


	OrderDTO[] dtos;
	int i;

	public CustomerImp(int size){
		dtos=new OrderDTO[size];
		System.out.println("inside the Customer const...........");
	}
	
	
	@Override
	public boolean craetOrder(OrderDTO dto){
		System.out.println("inside the craetOrder method.....");
		boolean isAdded=false;
		if(dto!=null && dto.getPersonName()!=null){
			this.dtos[i++]=dto;
			isAdded=true;
			System.out.println("Order  added succesfully...");
		}
		else{
			System.out.println("no Order added...");
		}
		return isAdded;
	}

	@Override
	public void getOrderDetails(){
		System.out.println("inside getOrderDetails  method");

		for(int i=0;i<dtos.length;i++){
			System.out.println(dtos[i]);
		}
	}

	@Override
	public OrderDTO getOrderDetailsByAddress(String address){
		System.out.println("inside getOrderDetailsByAddress()");
		OrderDTO orderDTO=null;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getAddress().equals(address)){
				System.out.println(orderDTO=dtos[i]);
			}
		}
		return orderDTO;
	}

	@Override
	public String getOrderPersonNameById(int id){
		System.out.println("inside getOrderPersonNameById()");
		String personName=null;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				System.out.println(personName=dtos[i].getPersonName());
			}else{
				System.out.println("enter the correct id it's not matching........");
			}
		}
		return personName;
	}

	@Override
	public String getOrderAddressByPersonName(String personName){
		System.out.println("inside getOrderAddressByPersonName()");
		String address=null;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getPersonName().equals(personName)){
				System.out.println(address=dtos[i].getAddress());
			}else{
				System.out.println("wrong input not matching......plz provide propare information");
			}
		}
		return address;
	}

	@Override
	public int[] getTotalNoOfItems(){
		System.out.println("inside getTotalNoOfItems()");
		int i,j;
		for(j=0,i=0;i<dtos.length;i++){
			System.out.println(dtos[i].getNoOfItems());
			j++;
		}
		int[] totalNoOfItems=new int[j];
		for(int k=0,l=0;k<dtos.length;k++){
			totalNoOfItems[l++]=dtos[k].getNoOfItems();
		}
		return totalNoOfItems;
	}


	@Override
	public String[] getAllOrdersPersonName(){
		System.out.println("inside getAllOrdersPersonName()");
		int i,j;
		for(j=0,i=0;i<dtos.length;i++){
			System.out.println(dtos[i].getPersonName());
			j++;
		}

		String[] allOrdersPersonName=new String[j];
		for(int k=0,m=0;k<dtos.length;k++){
			allOrdersPersonName[m++]=dtos[k].getPersonName();
		}
		return allOrdersPersonName;
	}	 

	@Override
	public  boolean updateOrderPriceById(int id,int price){
		System.out.println("inside updateOrderPriceById()");
		boolean updatePrice=false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getId()==id){
				dtos[i].setPrice(price);
				updatePrice=true;
			}
			else{
				System.out.println("No order with this id ....plz make sure that you have propare id");
			}
		}
		return updatePrice;
	}
	@Override
	public boolean updateAddressByPersonName(String personName,String address){
		System.out.println("inside updateAddressByPersonName()");
		boolean updateAddress=false;
		for(int i=0;i<dtos.length;i++){
			if (dtos[i].getPersonName().equals(personName)){
				dtos[i].setAddress(address);
				updateAddress=true;
			}
			else{
				System.out.println("no one with this name....plz make sure you provide correct person name");
			}
		}
		return updateAddress;
	}

	@Override
	public boolean deleteOrderByNoOfItems(int noOfItems){
		System.out.println("inside deleteOrderByNoOfItems()");
		boolean orderDeleted=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(dtos[j].getNoOfItems()!=noOfItems){
				dtos[i++]=dtos[j];
				orderDeleted=true;
			}else{
				System.out.println("no item is deleted ..plz see what happened");
			}
		}
		dtos=Arrays.copyOf(dtos,i);
		return orderDeleted;
	}
	
	
	@Override
	public boolean deleteOrderByPersonName(String personName){
		System.out.println("inside deleteOrderByPersonName()");
		boolean orderDeleted=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++){
			if(!dtos[j].getPersonName().equals(personName)){
				dtos[i++]=dtos[j];
				orderDeleted=true;
			}else{
				System.out.println("provide propare information item not deleted");
			}
		}
		dtos=Arrays.copyOf(dtos,i);
		return orderDeleted;
	}

}


