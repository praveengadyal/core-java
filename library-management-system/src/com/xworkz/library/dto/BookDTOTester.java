package com.xworkz.library.dto;

import java.util.Scanner;

public class BookDTOTester {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		BookDTO book=new BookDTO();
		System.out.println("enter the BookId");
		int id=sc.nextInt();
		System.out.println("enter the BookName");
		String bookName=sc.next();
		System.out.println("enter the Author name");
		String author=sc.next();
		System.out.println("enter the price of Boook");
		int price=sc.nextInt();
		System.out.println("The Book is About ");
		String about=sc.next();
		
		book.setId(id);
		book.setBookName(bookName);
		book.setAuthor(author);
		book.setPrice(price);
		book.setAbout(about);
		
		System.out.println(book);

	}

}
