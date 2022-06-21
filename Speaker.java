class Speaker{

static String brand="boat";
static double price=4500;
static String colour="blue";
static boolean isConnected;

public static void onOrOff(){
System.out.println("invoking the onoroff()");
if(isConnected==false){
isConnected=true;
System.out.println("speaker is turned on");
}
else if(isConnected==true){
isConnected=false;
System.out.println("the speaker is turned off");
}
}
public static void main(String a[]){
onOrOff();
onOrOff();
}
}