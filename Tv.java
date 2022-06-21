class Tv{

static String brandName="LG";
static int price=16990;
static String size="80cm";
static String display="LED";
static String connector="wi-fi";
static boolean isOn;

public static void onOrOff(){

System.out.println("invoking the onOrOff()");
if(isOn==false){
isOn=true;
System.out.println("tv is on");
}
else if(isOn==true){
isOn=false;
System.out.println("tv is off");
}
}

public static void main(String a[]){
onOrOff();
onOrOff();
}
}