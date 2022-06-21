class ShowRoom1{

int id;
static String name="woodland";
long contactNo;
static int noOfBranches=56;
String location;

public ShowRoom1(int id, String location,long contactNo ){
System.out.println("object is created");
//this keyword help compiler to point to instance variable
this.id=id;
this.location=location;
this.contactNo=contactNo;
}

public ShowRoom1(){
System.out.println("object is created");
}


public static void main(String ... a){

ShowRoom1 sr=new ShowRoom1(13,"jayanagar",1234567891L);

/*sr.id=13;
sr.contactNo=1234567891L;
  sr.name="woodland";
  sr.noOfBranches=56;
sr.location="jayanagar";*/

System.out.println("show room id : " +sr.id + " location : " +sr.location  + "  contact-number : " +sr.contactNo  );
System.out.println("show room name is " +ShowRoom1.name + " " + "number of branches " + ShowRoom1.noOfBranches );

/*System.out.println("show room contact number  " + sr.contactNo);
   System.out.println("show room branches " + sr.noOfBranches);
System.out.println("show room location  " + sr.location);*/

System.out.println("");

ShowRoom1 sr1=new ShowRoom1(45,"vijayanagar",9876543219L);

/*sr1.id=45;
sr1.contactNo=9876543219L;
   sr1.name="woodland";
   sr1.noOfBranches=56;
sr1.location="vijayanagar";*/
 
System.out.println("show room id : " +sr1.id + " location : " +sr1.location + "  contact-number : " +sr1.contactNo );
System.out.println("show room name is " +ShowRoom1.name + " " + "number of branches " + ShowRoom1.noOfBranches );

/*System.out.println("show room contact number  " + sr1.contactNo);
   System.out.println("show room name is " + sr1.name);
   System.out.println("show room branches " + sr1.noOfBranches);
System.out.println("show room location  " + sr1.location);*/

} 
}