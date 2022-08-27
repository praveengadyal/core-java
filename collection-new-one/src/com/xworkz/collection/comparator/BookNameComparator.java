package com.xworkz.collection.comparator;

import java.util.Comparator;

import com.xworkz.collection.dto.BookDTO;

public class BookNameComparator implements Comparator<BookDTO>{

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());
	}

}
