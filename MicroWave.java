class MicroWave{
static String name="samsung";
static int price=6490;
static String capacity="23litres";
static String colour="black";
static String material="stainless steel";
static boolean isOn;

public static void onOff(){
System.out.println("invoking the onoff()");
if(isOn==false){
isOn=true;
System.out.println(" micro wave is on");
}
else if(isOn==true){
isOn=false;
System.out.println("micro wave is off");
}
}

public static void main(String a[]){
onOff();
onOff();
}
}