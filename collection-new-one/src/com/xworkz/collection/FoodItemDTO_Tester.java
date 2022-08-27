package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.FoodItemDTO;

public class FoodItemDTO_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List list=new ArrayList();
		list.add(new FoodItemDTO(11,"yyy",260,"indian"));
		list.add(new FoodItemDTO(9,"chicken",300,"s-indian"));
		list.add(new FoodItemDTO(1,"chacolate",100,"xuajh"));
		list.add(new FoodItemDTO(7,"meals",200,"chinese"));
		list.add(new FoodItemDTO(3,"nnn",140,"mmmm"));
		list.add(new FoodItemDTO(2,"nsj",400,"ggghhh"));
		
         Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
