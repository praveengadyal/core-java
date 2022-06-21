class HistoricalPlace {
static String country="INDIA"; 
String name;
String location;
int builtIn;
String state;
int fee;

public HistoricalPlace(String name,String location, int builtIn,String state,int fee) {
this.name=name;
this.location = location;
this.builtIn=builtIn;
this.state=state;
this.fee=fee;
}

public static void main (String a[] ) {


HistoricalPlace hp=new HistoricalPlace("Taj Mahal","agra",1632,"U.P",50);
System.out.println("name :" +hp.name +"   location :"+hp.location +"   built-in :"+hp.builtIn +"   state :"+hp.state +"   entry fee: "+hp.fee);
System.out.println("coutry of  place :" + HistoricalPlace.country);

System.out.println("");

HistoricalPlace hp1=new HistoricalPlace("Hawa Mahal","jaipur",1799,"rajasthan",50);
System.out.println("name :" +hp1.name +"   location :"+hp1.location +"   built-in :"+hp1.builtIn +"   state :"+hp1.state +"   entry fee: "+hp1.fee);
System.out.println("coutry of  place :" + HistoricalPlace.country);

System.out.println("");

HistoricalPlace hp2=new HistoricalPlace("india gate","delhi",1921,"dehli",0);
System.out.println("name :" +hp2.name +"   location :"+hp2.location +"   built-in :"+hp2.builtIn +"   state :"+hp2.state +"   entry fee: "+hp2.fee);
System.out.println("coutry of  place :" + HistoricalPlace.country);

System.out.println("");


HistoricalPlace hp3=new HistoricalPlace("mysore palace","mysore",1897,"karnataka",50);
System.out.println("name :" +hp3.name +"   location :"+hp3.location +"   built-in :"+hp3.builtIn +"   state :"+hp3.state +"   entry fee: "+hp3.fee);
System.out.println("coutry of  place :" + HistoricalPlace.country);

System.out.println("");




}
}