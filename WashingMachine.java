class WashingMachine{
static String name="samsung";
static int price=40899;
static String weight="65kg";
static String colour="indox";
static boolean isOn;

public static void onOff(){
System.out.println("invoking the onoff()");
if(isOn==false){
isOn=true;
System.out.println("the washing machine is on");
}
else if(isOn==true){
isOn=false;
System.out.println("washing machine is off");
}
}

public static void main(String a[]){
onOff();
onOff();
}
}