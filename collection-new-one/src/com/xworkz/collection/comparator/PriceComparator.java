package com.xworkz.collection.comparator;

import java.util.Comparator;

import com.xworkz.collection.dto.BookDTO;

public class PriceComparator implements Comparator<BookDTO> {

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}

}
