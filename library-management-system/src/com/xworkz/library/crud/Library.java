package com.xworkz.library.crud;

import com.xworkz.library.dto.BookDTO;

public interface Library {

	



		public boolean creatBook(BookDTO dto);

		public void getBookDetails();

		public BookDTO getBookDetailsByPrice(int price);

		public  boolean updateBookPriceById(int id,int price);

		public boolean updateBookNameByAuthor(String author,String bookName);

		public boolean deleteBookById(int id);

		public boolean deleteBookByBookName(String bookName);



		}

