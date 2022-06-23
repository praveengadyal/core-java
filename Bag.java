class Bag{

String name;
String material;
String color;
int capacity;
int price;

public Bag(String name,String material,String color,int capacity,int price){
this();
this.name=name;
this.material=material;
this.color=color;
this.capacity=capacity;
this.price=price;
System.out.println("object created : parameterized constructor");
}

public Bag(){
this.carry();
System.out.println("object created : default constructor");
}

public static void carry(){
System.out.println("carring weight");
}

public static void main(String a[]){

Bag bag=new Bag("American tourister","polyester","black",32,1300);
System.out.println("name :"+bag.name + "   material :"+bag.material + "   color :"+bag.color + "   capacity in liters :"+bag.capacity + "   price :"+bag.price);
}
}