class Library{
 int id;
 int noOfBooks;
 String name;
 String location;
 String type;


public Library(int id,int noOfBooks,String name,String location,String type){

this.id=id;
this.noOfBooks=noOfBooks;
this.name=name;
this.location=location;
this.type=type;

}

public static void main(String ... a){

Library lib=new Library(145,3000,"govt library","rajajinagar","all type");
System.out.println("library id :"+lib.id +"  number of books :"+lib.noOfBooks +"  library name :"+lib.name +"  location :"+lib.location +"   types of book avaliable :"+lib.type);

System.out.println("");

Library lib1=new Library(666,2000,"vishnuvardhana library","vijaynagar","histroy");
System.out.println("library id :"+lib1.id +"  number of books :"+lib1.noOfBooks +"  library name :"+lib1.name +"  location :"+lib1.location +"   types of book avaliable :"+lib1.type);

System.out.println("");

Library lib2=new Library(077,1000,"vidya bharathi library","vijaynagar","all type");
System.out.println("library id :"+lib2.id +"  number of books :"+lib2.noOfBooks +"  library name :"+lib2.name +"  location :"+lib2.location +"   types of book avaliable :"+lib2.type);

System.out.println("");

Library lib3=new Library(222,1235,"public library west zone","chamrajpet","all type");
System.out.println("library id :"+lib3.id +"  number of books :"+lib3.noOfBooks +"  library name :"+lib3.name +"  location :"+lib3.location +"   types of book avaliable :"+lib3.type);
}
}