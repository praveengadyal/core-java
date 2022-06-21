class Ac{

static String name="whirlpool";
static String colour="white";
static int price=36490;
static String specialFeature="dust filter";
static boolean isOn;

public static void onOff(){
System.out.println("invoking the onOff()");
if(isOn==false){
isOn=true;
System.out.println("ac is on");
}
else if(isOn==true){
isOn=false;
System.out.println("ac is off");
}
}
public static void main(String a[]){
onOff();
onOff();
}
}