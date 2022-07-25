package com.xworkz.customer;

import java.util.Scanner;

import com.xworkz.customer.crud.impl.CustomerImp;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerImpTester {

	public static void main(String[] args) {
		


Scanner sc=new Scanner(System.in);
System.out.println("enter the number of orders to be Added");
int size=sc.nextInt();

CustomerImp c=new CustomerImp(size);


for(int i=0;i<size;i++){

OrderDTO dto=new OrderDTO();
System.out.println("enter the order id");
int id=sc.nextInt();
System.out.println("enter the personName on the order");
String personName=sc.next();
System.out.println("enter the Price of order");
int price=sc.nextInt();
System.out.println("enter the order is Address");
String address=sc.next();
System.out.println("enter the noOfItems of order");
int noOfItems=sc.nextInt();


dto.setId(id);
dto.setPersonName(personName);
dto.setPrice(price);
dto.setAddress(address);
dto.setNoOfItems(noOfItems);
c.craetOrder(dto);
}

String option=null;


do{

System.out.println("enter the 1 to getOrderDetails.....");
System.out.println("enter the 2 to updateAddressByPersonName.....");
System.out.println("enter the 3 to updateOrderPriceById.....");
System.out.println("enter the 4 to deleteOrderByPersonName.....");
System.out.println("enter the 5 to deleteOrderByNoOfItems.....");
System.out.println("enter the 6 to getOrderDetailsByAddress...");
System.out.println("enter the 7 to getOrderPersonNameById...");
System.out.println("enter the 8 to getOrderAddressByPersonName...");
System.out.println("enter the 9 to getTotalNoOfItems...");
System.out.println("enter the 0 to getAllOrdersPersonName...");

System.out.println("enter the number to perform above metioned task...");
int choice=sc.nextInt();

switch(choice){

case 1: c.getOrderDetails();
break;

case 2: System.out.println("provide the order personName with which you want to update.....");
String personName1=sc.next();
System.out.println("enter the updated Address");
String address1=sc.next();
c.updateAddressByPersonName(personName1,address1);
c.getOrderDetails();
break;


case 3:System.out.println("provide the Order Id with which you want to update....");
int id1=sc.nextInt();
System.out.println("enter the updated price");
int price1=sc.nextInt();
c.updateOrderPriceById(id1,price1);
c.getOrderDetails();
break;


case 4: System.out.println("enter the personName with which you want to delete......");
String personName=sc.next();
c.deleteOrderByPersonName(personName);
c.getOrderDetails();

break;


case 5: System.out.println("enter the noOfItems with which you want delete....");
int noOfItems=sc.nextInt();
c.deleteOrderByNoOfItems(noOfItems);
c.getOrderDetails();
break;


case 6: System.out.println("enter the Address if matched orderDetails will be availabel");
String exAddress=sc.next();
c.getOrderDetailsByAddress(exAddress);
c.getOrderDetails();
break;

case 7: System.out.println("enter the Id if matched personName of order will be availabel ");
int exId=sc.nextInt();
c.getOrderPersonNameById(exId);
c.getOrderDetails();
break;

case 8: System.out.println("enter the personName if matched we'll get order Address ");
String exPersonName=sc.next();
c.getOrderAddressByPersonName(exPersonName);
c.getOrderDetails();
break;

case 9: c.getTotalNoOfItems();
c.getOrderDetails();
break;

case 0: c.getAllOrdersPersonName();
c.getOrderDetails();
break;
 
default : System.out.println("invalid number ....provide propare number");
break;


}
System.out.println("enter---- yes to continue and no to exit");
option=sc.next();


}while(option.equals("yes"));

}


	}


