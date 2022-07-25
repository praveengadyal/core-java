package com.xworkz.customer.dto;

public class OrderDTO {

	
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private int price;
	private String personName;
	private String address;
	private int noOfItems;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	
	
	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", price=" + price + ", personName=" + personName + ", address=" + address
				+ ", noOfItems=" + noOfItems + "]";
	}
	
	
	
}
