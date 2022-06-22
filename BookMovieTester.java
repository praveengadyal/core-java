class BookMovieTester{

public static void main(String a[]){

String movies[]={"om","h2o","83","A","charlie 777","bangalore days","vikramadityan","charlie"};
String snacks[]={"cooldrink","samosa","popcorn","sandwitch","fries"};

BookMovie bm=new BookMovie("navarang",200,movies,snacks,300);
bm.show(20,"devi","om");
bm.orderedSnack("fries",20);
System.out.println(" ----------------------- ");

BookMovie bm1=new BookMovie("pvr",300,movies,snacks,400);
bm1.show(10,"praveen","charlie");
bm1.orderedSnack("popcorn",10);
System.out.println(" ---------------------------- ");

BookMovie bm2=new BookMovie("inox",250,movies,snacks,350);
bm2.show(15,"xyz","bangalore days");
bm2.orderedSnack("sandwitch",25);
}
}