import java.util.Arrays;
class Libraryx{

BookDTO[] dtos;
int i;

public Libraryx(int size){
dtos=new BookDTO[size];
System.out.println("inside library construcror......");
}

public boolean creatBook(BookDTO dto){
System.out.println("inside the creatBook method.....");
boolean isAdded=false;
if(dto!=null && dto.getBookName()!=null){
this.dtos[i++]=dto;
isAdded=true;
System.out.println("book is added succesfully...");
}
else{
  System.out.println("no books added...");
}
return isAdded;
}


public void getBookDetails(){
System.out.println("inside getBook deatils method");

for(int i=0;i<dtos.length;i++){
 System.out.println(dtos[i]);
}
}

public BookDTO getBookDetailsByPrice(int price){
System.out.println("inside getBookDetailsByPrice()");
BookDTO bookDTO=null;
for(int i=0;i<dtos.length;i++){
if(dtos[i].getPrice()==price){
System.out.println(bookDTO=dtos[i]);
}
}
return bookDTO;
}

public  boolean updateBookPriceById(int id,int price){
System.out.println("inside updateBookPriceById()");
boolean updatePrice=false;
for(int i=0;i<dtos.length;i++){
    if(dtos[i].getId()==id){
        dtos[i].setPrice(price);
         updatePrice=true;
}
else{
   System.out.println("No Book with this id ....plz make sure that you have propare id");
}
}
return updatePrice;
}

public boolean updateBookNameByAuthor(String author,String bookName){
System.out.println("inside updateBookNameByAuthor()");
boolean updateBookName=false;
for(int i=0;i<dtos.length;i++){
   if (dtos[i].getAuthor().equals(author)){
         dtos[i].setBookName(bookName);
         updateBookName=true;
}
else{
System.out.println("no author with this name....plz make sure you provide correct author");
}
}
return updateBookName;
}


public boolean deleteBookById(int id){
System.out.println("inside deleteBookById()");
boolean bookDeleted=false;
int i,j;
for(i=0,j=0;j<dtos.length;j++){
if(dtos[j].getId()!=id){
dtos[i++]=dtos[j];
bookDeleted=true;
}else{
System.out.println("no item is deleted ..plz see what happened");
}
}
dtos=Arrays.copyOf(dtos,i);
return bookDeleted;
}

public boolean deleteBookByBookName(String bookName){
System.out.println("inside deleteBookByBookName()");
boolean bookDeleted=false;
int i,j;
for(i=0,j=0;j<dtos.length;j++){
if(!dtos[j].getBookName().equals(bookName)){
   dtos[i++]=dtos[j];
   bookDeleted=true;
}else{
System.out.println("provide propare information item not deleted");
}
}
dtos=Arrays.copyOf(dtos,i);
return bookDeleted;
}

}




