class ShoppingMall1{

  String name;
  int id;
  String address;
  int noOfEmployees;
  String openingTime;
  String closingTime;

public ShoppingMall1(){
System.out.println("Mall is created");
}

public static void main(String[] a){

  ShoppingMall1 sm=new ShoppingMall1();
  sm.name="GT World Mall";
  sm.id=472;
  sm.address="cholourpalya";
  sm.noOfEmployees=100;
  sm.openingTime="10am";
  sm.closingTime="10pm";

System.out.println("mall name : " + sm.name);
System.out.println("mall id : " + sm.id);
System.out.println("address : " + sm.address);
System.out.println("number of employees : " + sm.noOfEmployees);
System.out.println("opening time of mall is : " + sm.openingTime);
System.out.println("closing time of mall is : " + sm.closingTime);

System.out.println("");

 ShoppingMall1 sm1=new ShoppingMall1();
  sm1.name="Forum Mall";
  sm1.id=7458;
  sm1.address="binnipete";
  sm1.noOfEmployees=160;
  sm1.openingTime="10am";
  sm1.closingTime="9pm";

System.out.println("mall name : " + sm1.name);
System.out.println("mall id : " + sm1.id);
System.out.println("address : " + sm.address);
System.out.println("number of employees : " + sm1.noOfEmployees);
System.out.println("opening time of mall is : " + sm1.openingTime);
System.out.println("closing time of mall is : " + sm1.closingTime);

System.out.println("");

 ShoppingMall1 sm2=new ShoppingMall1();
  sm2.name="mantri square";
  sm2.id=3654;
  sm2.address="malleshwaram";
  sm2.noOfEmployees=220;
  sm2.openingTime="10am";
  sm2.closingTime="11pm";

System.out.println("mall name : " + sm2.name);
System.out.println("mall id : " + sm2.id);
System.out.println("address : " + sm2.address);
System.out.println("number of employees : " + sm2.noOfEmployees);
System.out.println("opening time of mall is : " + sm2.openingTime);
System.out.println("closing time of mall is : " + sm2.closingTime);

System.out.println("");

 ShoppingMall1 sm3=new ShoppingMall1();
  sm3.name="gopalan";
  sm3.id=4367;
  sm3.address="mysore rd";
  sm3.noOfEmployees=100;
  sm3.openingTime="10am";
  sm3.closingTime="10pm";

System.out.println("mall name : " + sm3.name);
System.out.println("mall id : " + sm3.id);
System.out.println("address : " + sm3.address);
System.out.println("number of employees : " + sm3.noOfEmployees);
System.out.println("opening time of mall is : " + sm3.openingTime);
System.out.println("closing time of mall is : " + sm3.closingTime);


}


}