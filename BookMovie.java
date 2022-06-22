class BookMovie{

String movies[];
String theatreName;
int noOfTickets;
static int ticketPrice=600;
int totalNoOfTickets;
int totalTicketPrice;

String snacks[];
static int snackPrice=100;
int totalSnackPrice;
int snackQuantity;
int totalSnacks;


public BookMovie(String theatreName,int totalNoOfTickets,String movies[],String snacks[],int totalSnacks)
{

this.theatreName=theatreName;
this.totalNoOfTickets=totalNoOfTickets;
this.movies=movies;
this.snacks=snacks;
this.totalSnacks=totalSnacks;
System.out.println("object is created");

}

public int show(int noOfTickets,String bookedBy,String movieName)
{
int totalTicketPrice=0;
System.out.println("inside show method");
System.out.println("arg 1:" + noOfTickets);
System.out.println("arg 2:" + bookedBy);
System.out.println("arg 3:" + movieName);

for(int index=0;index<movies.length;index++)
{

if (movieName==movies[index])
{
System.out.println("movie name is matched");

if(noOfTickets<totalNoOfTickets)
{
totalTicketPrice=noOfTickets*ticketPrice;
totalNoOfTickets=totalNoOfTickets-noOfTickets;
System.out.println("for movie:" + movieName +"  " + "number of tickets availabe:" + totalNoOfTickets + "  "+ "total price is:" + totalTicketPrice);
}
else
{
System.out.println("no tickets");
}
 }
else
{
System.out.println("movie not avaliable");
}
}

return totalTicketPrice;
}

public int orderedSnack(String snackName,int snackQuantity)
{
int totalSnackPrice=0;
System.out.println("inside ordered snacks method");
System.out.println("arg 1;" + snackName);
System.out.println("arg 2:" + snackQuantity);

for(int i=0;i<snacks.length;i++)
{
if(snackName==snacks[i])
{
System.out.println("your snack is present");

if(snackQuantity<totalSnacks)
{
totalSnackPrice=snackQuantity*snackPrice;
totalSnacks=totalSnacks-snackQuantity;
System.out.println("snack name:" +snackName +"   "+ " snacks available:" + totalSnacks +"  "+" total snack price:" + totalSnackPrice);
}
else
{
System.out.println("we are run out of snack items");
}
 }
else
{
System.out.println("your snack item not found");
}
}
return totalSnackPrice;
}
}