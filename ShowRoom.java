class ShowRoom{

// states / variables / properties / fields
String name;
int id;
int noOfEmployees;
String address;
long contactNo;

public ShowRoom(){
System.out.println("showroom created");
}

public static void main(String ... a){

ShowRoom sr=new ShowRoom();
sr.name="silicon motor";
sr.id=123;
sr.contactNo=8023107031L;
sr.address="vijayanagar";
sr.noOfEmployees=56;

System.out.println("show room name " + sr.name);
System.out.println("show room iD " + sr.id);
System.out.println("show room contact number " + sr.contactNo);
System.out.println("show room adderss " + sr.address);
System.out.println("number of employees at show room " + sr.noOfEmployees);

System.out.println("");

ShowRoom sr1=new ShowRoom();
sr1.name="Tata motor";
sr1.id=45;
sr1.contactNo=9731309701L;
sr1.address="navarang rajajinagar";
sr1.noOfEmployees=37;

System.out.println("show room name is " + sr1.name);
System.out.println("show room iD is " + sr1.id);
System.out.println("show room contact number is " + sr1.contactNo);
System.out.println("show room adderss is " + sr1.address);
System.out.println("number of employees at show room are " + sr1.noOfEmployees);

System.out.println("");

ShowRoom sr2=new ShowRoom();
sr2.name="levi's";
sr2.id=67;
sr2.contactNo=8041736236L;
sr2.address="vijayanagar";
sr2.noOfEmployees=17;

System.out.println("show room name is " + sr2.name);
System.out.println("show room iD is " + sr2.id);
System.out.println("show room contact number is " + sr2.contactNo);
System.out.println("show room adderss is" + sr2.address);
System.out.println("number of employees at show room are" + sr2.noOfEmployees);

System.out.println("");

ShowRoom sr3=new ShowRoom();
sr3.name="Reliance Digital";
sr3.id=79;
sr3.contactNo=8591404309L;
sr3.address="HBCS layout";
sr3.noOfEmployees=80;

System.out.println("show room name is " + sr3.name);
System.out.println("show room iD is " + sr3.id);
System.out.println("show room contact number is " + sr3.contactNo);
System.out.println("show room adderss is " + sr3.address);
System.out.println("number of employees at show room are " + sr3.noOfEmployees);
}

}