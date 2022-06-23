class HeadPhone{

String brand;
String color;
String type;
String mName;
int price;
int playBack;

public HeadPhone(String brand,String color,String type,String mName,int price,int playBack){
this();
this.brand=brand;
this.color=color;
this.type=type;
this.mName=mName;
this.price=price;
this.playBack=playBack;
System.out.println("object created : parameterized");
}

public HeadPhone(){
this.provideMusic();
System.out.println("object created : default constructor");
}

public void provideMusic(){
System.out.println("listen to this song");
}


public static void main(String a[]){

HeadPhone hp=new HeadPhone("BoAt","luscious Black","wireless","Rockerz 450",1500,15);
System.out.println(" brand :"+hp.brand + "   color :"+hp.color + "   type :"+hp.type + "   model name :"+hp.mName + "   price :"+hp.price + "   playback time in hrs :"+hp.playBack);
}
}