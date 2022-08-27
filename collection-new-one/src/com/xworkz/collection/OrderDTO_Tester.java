package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.OrderDTO;

public class OrderDTO_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		list.add(new OrderDTO(9,500,"praveen","banglore",3));
		list.add(new OrderDTO(11,100,"vijay","balagavi",5));
		list.add(new OrderDTO(3,1000,"nagaraj","hubli",2));
		list.add(new OrderDTO(1,489,"subhas","viajyapur",1));
		list.add(new OrderDTO(8,799,"rahull","biddi",4));
		list.add(new OrderDTO(19,699,"malik","rajajinagar",2));
		
		
        Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
