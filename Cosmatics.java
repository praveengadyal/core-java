class Cosmatics{

 String name;
 int id;
 int price;
 String colour;
 String type;
 String exp;
 
public Cosmatics(){
System.out.println("product is created");
}

public static void main(String ... a){

Cosmatics cos=new Cosmatics();
cos.name="sugar cosmetics";
cos.id=387;
cos.price=200;
cos.colour="01 mojito";
cos.type="lip moisturizer";
cos.exp="31 oct 2024";

System.out.println("cosmatics brand : " + cos.name);
System.out.println("id is " + cos.id);
System.out.println("price of product : " + cos.price);
System.out.println("colour of product : "  + cos.colour);
System.out.println("product type : " + cos.type);
System.out.println("expire date : " + cos.exp);

System.out.println("");


Cosmatics cos1=new Cosmatics();
cos1.name="Insight";
cos1.id=467;
cos1.price=200;
cos1.colour="multicolor";
cos1.type="concealer palette";
cos1.exp="31 dec 2024";

System.out.println("cosmatics brand : " + cos1.name);
System.out.println("id is " + cos1.id);
System.out.println("price of product : " + cos1.price);
System.out.println("colour of product : "  + cos1.colour);
System.out.println("product type : " + cos1.type);
System.out.println("expire date : " + cos1.exp);

System.out.println("");


Cosmatics cos2=new Cosmatics();
cos2.name="just herbs";
cos2.id=657;
cos2.price=450;
cos2.colour="yellow";
cos2.type="lipstick";
cos2.exp="30 may 2021";

System.out.println("cosmatics brand : " + cos2.name);
System.out.println("id is " + cos2.id);
System.out.println("price of product : " + cos2.price);
System.out.println("colour of product : "  + cos2.colour);
System.out.println("product type : " + cos2.type);
System.out.println("expire date : " + cos2.exp);

System.out.println("");


Cosmatics cos3=new Cosmatics();
cos3.name="mars";
cos3.id=659;
cos3.price=350;
cos3.colour="shade-1";
cos3.type="eyeshadow palette";
cos3.exp="29 june 2021";

System.out.println("cosmatics brand : " + cos3.name);
System.out.println("id is " + cos3.id);
System.out.println("price of product : " + cos3.price);
System.out.println("colour of product : "  + cos3.colour);
System.out.println("product type : " + cos3.type);
System.out.println("expire date : " + cos3.exp);



}

}