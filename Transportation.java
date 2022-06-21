class Transportation{

int id;
String mode;
String name;
int capacity;
int fare;
static String user="passengers";
static String fuel="petroleumproducts";


public Transportation(int id,String mode,String name,int capacity,int fare){
this.id=id;
this.mode=mode;
this.name=name;
this.capacity=capacity;
this.fare=fare;
}

public static void main(String ... a){

Transportation trans=new Transportation(982,"Bus","K.S.R.T.C",64,10);
System.out.println("transportation id :"+trans.id  +"  mode of transport:"+trans.mode +"  transport name:"+trans.name +"  capacity of transport:"+trans.capacity + " fare per km :" + trans.fare);
System.out.println(Transportation.user +":are the users this transport   " + " fuel for the transportation is :" + Transportation.fuel);

System.out.println("");

Transportation trans1=new Transportation(119,"train","namma metro",300,15);
System.out.println("transportation id :"+trans1.id  +"  mode of transport:"+trans1.mode +"  transport name:"+trans1.name +"  capacity of transport:"+trans1.capacity + " fare per km :" + trans1.fare);
System.out.println(Transportation.user +":are the users this transport   " + " fuel for the transportation is :" + Transportation.fuel);

System.out.println("");

Transportation trans2=new Transportation(555,"plane","vistara",400,300);
System.out.println("transportation id :"+trans2.id  +"  mode of transport:"+trans2.mode +"  transport name:"+trans2.name +"  capacity of transport:"+trans2.capacity + " fare per km :" + trans2.fare );
System.out.println(Transportation.user +":are the users this transport   " + " fuel for the transportation is :" + Transportation.fuel);

System.out.println("");

Transportation trans3=new Transportation(777,"car","tata",6,12);
System.out.println("transportation id :"+trans3.id  +"  mode of transport:"+trans3.mode +"  transport name:"+trans3.name +"  capacity of transport:"+trans3.capacity + " fare per km :" + trans3.fare);
System.out.println(Transportation.user +":are users this transport   " + " fuel for the transportation is :" + Transportation.fuel);
}
}