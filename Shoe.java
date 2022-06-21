class Shoe{

String name;
int id;
int cost;
int size;
String colour;

public Shoe(){
System.out.println("object is created");
}

public static void main(String[] a){

Shoe sh=new Shoe();
sh.name="air jordan";
sh.id=34;
sh.cost=20000;
sh.size=9;
sh.colour="black";
System.out.println("shoe name is " + sh.name);
System.out.println("show id is " + sh.id);
System.out.println("cost of the shoe is " + sh.cost);
System.out.println("the different sizes of the shoe are...." + sh.size);
System.out.println("the different colour options are.." + sh.colour);

System.out.println("");


Shoe sh1=new Shoe();
sh1.id=67;
sh1.name="nike";
sh1.cost=10000;
sh1.size=11;
sh1.colour="white";
System.out.println("shoe brand is " + sh1.name);
System.out.println("show id is " + sh1.id);
System.out.println("cost of shoe is " + sh1.cost);
System.out.println("avaliable sizes are.." + sh1.size);
System.out.println("colour option are " + sh1.colour);

System.out.println("");


Shoe sh2=new Shoe();
sh2.id=84;
sh2.name="gucci";
sh2.cost=35000;
sh2.size=10;
sh2.colour="blue";
System.out.println("shoe brand is " + sh2.name);
System.out.println("show id is " + sh2.id);
System.out.println("shoe cost is " + sh2.cost);
System.out.println("size options are.." + sh2.size);
System.out.println("colour options are ..."  + sh2.colour);

System.out.println("");


Shoe sh3=new Shoe();
sh3.id=89;
sh3.name="LV";
sh3.cost=50000;
sh3.size=12;
sh3.colour="purple";
System.out.println("shoe brand is " + sh3.name);
System.out.println("show id is " + sh3.id);
System.out.println("cost is " + sh3.cost);
System.out.println("size option .." + sh3.size);
System.out.println("colour options are " + sh3.colour);



}

}