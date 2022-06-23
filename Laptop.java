class Laptop{

String brand;
String series;
float size;
String color;
String cpu;
int hardDisk;
int ram;
int price;


public Laptop(){
this.automatesTask();
System.out.println("control flow in default constructor : object created ");
}

public Laptop( String brand,String series,float size,String color,String cpu,int hardDisk,int ram,int price ){
this();
this.brand=brand;
this.series=series;
this.size=size;
this.color=color;
this.cpu=cpu;
this.hardDisk=hardDisk;
this.ram=ram;
this.price=price;
System.out.println(" parameterized constructor : object is created");
}

public static void automatesTask(){
System.out.println("work done efficiently : number of works can be done");
}

public static void main(String a[]){

Laptop lt=new Laptop("ASUS","VivoBook 15",39.62f,"silver","celeron N4020",256,4,26990);
System.out.println( "brand :"+lt.brand + "  series :"+lt.series + "  size :"+lt.size + "  color :"+lt.color + "  cpu :"+lt.cpu + "  hard disk :"+lt.hardDisk + "  ram :"+lt.ram  + "  price :"+lt.price );


}

}