class Fruits{
String name;
int price;

public Fruits(){
this.provideNutr();
System.out.println("object is created");
}

public static void provideNutr(){
System.out.println("hi");
}

public Fruits(String name,int price){
this();
this.name=name;
this.price=price;
}

public static void main(String a[]){
Fruits f=new Fruits("mabgo",134);
System.out.println(f.name +" "+f.price );


}
}