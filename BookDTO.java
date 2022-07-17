class BookDTO{


public BookDTO(){
System.out.println("inside the DTO constructor......");
}

private int id;
private String bookName;
private String author;
private int price;
private String about;

public int getId(){return id;}

public void setId(int id){this.id=id;}

public String getBookName(){return bookName;}

public void setBookName(String bookName){this.bookName=bookName;}

public String getAuthor(){return author;}

public void setAuthor(String author){this.author=author;}

public int getPrice(){return price;}

public void setPrice(int price){this.price=price;}

public String getAbout(){return about;}

public void setAbout(String about){this.about=about;}

@Override
public String toString(){
return "[BookDTO : id="+this.getId()+",bookName="+this.getBookName()+",author="+this.getAuthor()+",price="+this.getPrice()+",about="+this.getAbout()+"]";
}
}



