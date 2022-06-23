class Phone{
 String brand;
String mName;
 String color;
String oS;
int storage;
int ram;
int price; 


public Phone(){
this.communication();
System.out.println("object is created through default constructor");
}


public Phone(String brand,String mName,String color,String oS,int storage,int ram,int price){
this();
this.brand=brand;
this.mName=mName;
this.color=color;
this.oS=oS;
this.storage=storage;
this.ram=ram;
this.price=price;
System.out.println(" object is created through parameterized constructor");

}


public static void communication(){
System.out.println("welcome to the new world");
}

public static void main(String a[]){

Phone ph=new Phone("samsung","galaxy s20 FE","cloud lavender","Android 11.0",128,8,36990);
System.out.println("brand :"+ph.brand + "  model :"+ph.mName + "  color :"+ph.color + "  OS :"+ph.oS + "  Stroage in GB :"+ph.storage +"  Ram in GB :"+ph.ram +"  price :"+ph.price);

}

}