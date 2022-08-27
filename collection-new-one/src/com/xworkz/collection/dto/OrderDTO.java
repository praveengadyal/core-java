package com.xworkz.collection.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class OrderDTO implements Comparable<OrderDTO> {
	

	private int id;
	private int price;
	private String personName;
	private String address;
	private int noOfItems;
	
	
	
	public OrderDTO(int id, int price, String personName, String address, int noOfItems) {
		super();
		this.id = id;
		this.price = price;
		this.personName = personName;
		this.address = address;
		this.noOfItems = noOfItems;
	}



	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", price=" + price + ", personName=" + personName + ", address=" + address
				+ ", noOfItems=" + noOfItems + "]";
	}

	@Override
	public int compareTo(OrderDTO o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}
