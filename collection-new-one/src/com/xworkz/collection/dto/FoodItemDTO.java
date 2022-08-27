package com.xworkz.collection.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class FoodItemDTO implements Comparable<FoodItemDTO> {
	
	 private int id;
     private String name;
     private int price;
     private String type;
        
	public FoodItemDTO(int id, String name, int price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "FoodItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	@Override
	public int compareTo(FoodItemDTO o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
}