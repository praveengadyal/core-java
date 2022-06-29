class ElectronicDevicesTester{

public static void main(String a[]){

TubeLight tl=new TubeLight();
tl.type="LED";
tl.wattas=20;
tl.price=555;
tl.usage="lights";
tl.feature="energy efficient";
tl.warranty="2 years";
tl.providesLight();
System.out.println(tl.type +"  "+tl.wattas +"   "+tl.price+"   "+tl.usage+"   "+tl.feature+"   "+tl.warranty);
}
}