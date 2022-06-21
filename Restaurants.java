class Restaurants{

 String name;
 int id;
 String address;
 String ownerName;
 long contactNo;

public Restaurants(){
System.out.println("restaurant created");
}

public static void main(String ... a){

Restaurants res=new Restaurants();
res.name="grill briyanis";
res.id=67;
res.address="vijayanagar";
res.contactNo=7899355055L;
res.ownerName="xyz";

System.out.println("restaurant name is " + res.name);
System.out.println("restaurant id is " + res.id);
System.out.println("restaurant address is " + res.address);
System.out.println("restaurant owner " + res.ownerName);
System.out.println("restaurant contact number " + res.contactNo);

System.out.println("");


Restaurants res1=new Restaurants();
res1.name="the lemon light";
res1.id=33;
res1.address="hoshalli";
res1.contactNo=8050261854L;
res1.ownerName="ABC";

System.out.println("restaurant name is " + res1.name);
System.out.println("restaurant id is " + res1.id);
System.out.println("restaurant address is " + res1.address);
System.out.println("restaurant owner " + res1.ownerName);
System.out.println("restaurant contact number " + res1.contactNo);

System.out.println("");


Restaurants res2=new Restaurants();
res2.name="south ruchi's";
res2.id=99;
res2.address="dasarahalli";
res2.contactNo=7899830606L;
res2.ownerName="rahul";

System.out.println("restaurant name is " + res2.name);
System.out.println("restaurant id is " + res2.id);
System.out.println("restaurant address is " + res2.address);
System.out.println("restaurant owner " + res2.ownerName);
System.out.println("restaurant contact number " + res2.contactNo);

System.out.println("");


Restaurants res3=new Restaurants();
res3.name="hot coffee";
res3.id=97;
res3.address="hoshalli";
res3.contactNo=7353395193L;
res3.ownerName="vijay";

System.out.println("restaurant name is " + res3.name);
System.out.println("restaurant id is " + res3.id);
System.out.println("restaurant address is " + res3.address);
System.out.println("restaurant owner " + res3.ownerName);
System.out.println("restaurant contact number " + res3.contactNo);

System.out.println("");


}

}