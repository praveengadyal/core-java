package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.comparator.AboutComparator;
import com.xworkz.collection.comparator.AuthorComparator;
import com.xworkz.collection.comparator.BookNameComparator;
import com.xworkz.collection.comparator.PriceComparator;
import com.xworkz.collection.dto.BookDTO;

public class BookDTO_Tester {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		list.add(new BookDTO(7,"win","xyz",200,"life"));
		list.add(new BookDTO(11,"zzz","abc",300,"jdskj"));
		list.add(new BookDTO(9,"lose","adfa",500,"kk"));
		list.add(new BookDTO(5,"ajs","cnc",150,"struggle"));
		list.add(new BookDTO(8,"skjj","bbb",800,"win"));
	/*	
		Collections.sort(list);
		
		list.forEach(System.out::println);*/
		
        Collections.sort(list, new BookNameComparator());
        list.forEach(System.out::println);
        
        System.out.println("...........");
        
		Collections.sort(list, new AboutComparator());
		list.forEach(System.out::println);
		
	    System.out.println("...........");
	    
		Collections.sort(list, new PriceComparator());
		list.forEach(System.out::println);
		

	    System.out.println("...........");
	    
		Collections.sort(list, new AuthorComparator());
		list.forEach(System.out::println);
		
		
	    
	}

}
