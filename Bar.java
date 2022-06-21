class Bar{

String name;
int id;
int gstNo;
String type;
String ownerName;
String brands;

public Bar(){
System.out.println("bar is created");
}

public static void main(String ... a){

Bar b=new Bar();
b.name="santosh";
b.id=5357;
b.gstNo=9472;
b.type="bar n restaurant";
b.ownerName="subhash";
b.brands="old monk";

System.out.println("Bar name : " + b.name);
System.out.println("bar id : " + b.id);
System.out.println("gst number of bar : " + b.gstNo);
System.out.println("type of bar : " + b.type);
System.out.println("owner of bar : " + b.ownerName);
System.out.println("different brands are : " + b.brands);

System.out.println("");

Bar b1=new Bar();
b1.name="gurukrupa";
b1.id=7837;
b1.gstNo=25563;
b1.type="msp bar";
b1.ownerName="kartik";
b1.brands="IB";

System.out.println("Bar name : " + b1.name);
System.out.println("bar id : " + b1.id);
System.out.println("gst number of bar : " + b1.gstNo);
System.out.println("type of bar : " + b1.type);
System.out.println("owner of bar : " + b1.ownerName);
System.out.println("different brands are : " + b1.brands);

System.out.println("");

Bar b2=new Bar();
b2.name="tirumala";
b2.id=9584;
b2.gstNo=2839;
b2.type="bar n restaurant";
b2.ownerName="sameer";
b2.brands="BP";

System.out.println("Bar name : " + b2.name);
System.out.println("bar id : " + b2.id);
System.out.println("gst number of bar : " + b2.gstNo);
System.out.println("type of bar : " + b2.type);
System.out.println("owner of bar : " + b2.ownerName);
System.out.println("different brands are : " + b2.brands);

System.out.println("");


Bar b3=new Bar();
b3.name="mayura 1989";
b3.id=5747;
b3.gstNo=8239;
b3.type="bar n kitchen";
b3.ownerName="nagaraj";
b3.brands="MC";

System.out.println("Bar name : " + b3.name);
System.out.println("bar id : " + b3.id);
System.out.println("gst number of bar : " + b3.gstNo);
System.out.println("type of bar : " + b3.type);
System.out.println("owner of bar : " + b3.ownerName);
System.out.println("different brands are : " + b3.brands);





}
}