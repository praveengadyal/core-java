import java.util.Scanner;
class LibraryxTester{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of Books to be added");
int size=sc.nextInt();

Libraryx lx=new Libraryx(size);

for(int i=0;i<size;i++){

BookDTO dto=new BookDTO();
System.out.println("enter the Book id");
int id=sc.nextInt();
System.out.println("enter the Book name");
String bookName=sc.next();
System.out.println("enter the Author of Book");
String author=sc.next();
System.out.println("enter the Book Price");
int price=sc.nextInt();
System.out.println("enter the Book is About");
String about=sc.next();

dto.setId(id);
dto.setBookName(bookName);
dto.setAuthor(author);
dto.setPrice(price);
dto.setAbout(about);
lx.creatBook(dto);
}
String option=null;


do{

System.out.println("enter the 1 to getBookDetails.....");
System.out.println("enter the 2 to updateBookNameByAuthor.....");
System.out.println("enter the 3 to updateBookPriceById.....");
System.out.println("enter the 4 to deleteBookByBookName.....");
System.out.println("enter the 5 to deleteBookById.....");
System.out.println("enter the 6 to getBookDetailsByPrice");
System.out.println("enter the number to perform above metioned task...");
int choice=sc.nextInt();

switch(choice){

case 1: lx.getBookDetails();
break;

case 2:System.out.println("provide the author name you want to check");
String author1=sc.next();
System.out.println("enter the new/updated bookName");
String bookName1=sc.next();
lx.updateBookNameByAuthor(author1,bookName1);
lx.getBookDetails();
break;

case 3:System.out.println("provide the id you want to check");
int id1=sc.nextInt();
System.out.println("enter the new/updated price");
int price1=sc.nextInt();
lx.updateBookPriceById(id1,price1);
lx.getBookDetails();
break;

case 4: System.out.println("enter the bookName to be deleted");
String bookName=sc.next();
lx.deleteBookByBookName(bookName);
lx.getBookDetails();
break;

case 5:System.out.println("enter the BookId");
int id=sc.nextInt();
lx.deleteBookById(id);
lx.getBookDetails();
break;

case 6: System.out.println("enter the price so that all details can be fecthed...");
int exPrice=sc.nextInt();
lx.getBookDetailsByPrice(exPrice);
lx.getBookDetails();
break;

default : System.out.println("invalid number...type propare number");
break;
}
System.out.println("enter---  yes to continue...  no to exit...");
option=sc.next();
}while(option.equals("yes"));

}
}



/*
lx.getBookDetails();


System.out.println("provide the author name you want to check");
String author1=sc.next();
System.out.println("enter the new/updated bookName");
String bookName1=sc.next();
lx.updateBookNameByAuthor(author1,bookName1);
lx.getBookDetails();

System.out.println("provide the id you want to check");
int id1=sc.nextInt();
System.out.println("enter the new/updated price");
int price1=sc.nextInt();
lx.updateBookPriceById(id1,price1);
lx.getBookDetails();

System.out.println("enter the bookName to be deleted");
String bookName=sc.next();
lx.deleteBookByBookName(bookName);
lx.getBookDetails();

System.out.println("enter the BookId");
int id=sc.nextInt();
lx.deleteBookById(id);
lx.getBookDetails();*/

