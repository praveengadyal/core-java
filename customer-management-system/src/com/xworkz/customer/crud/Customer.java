package com.xworkz.customer.crud;

import com.xworkz.customer.dto.OrderDTO;

public interface Customer {
	
	


		public boolean craetOrder(OrderDTO dto);

		public void getOrderDetails();

		public OrderDTO getOrderDetailsByAddress(String address);

		public String getOrderPersonNameById(int id);

		public String getOrderAddressByPersonName(String personName);

		public int[] getTotalNoOfItems();

		public String[] getAllOrdersPersonName();

		public  boolean updateOrderPriceById(int id,int price);

		public boolean updateAddressByPersonName(String personName,String address);

		public boolean deleteOrderByNoOfItems(int noOfItems);

		public boolean deleteOrderByPersonName(String personName);



		}


