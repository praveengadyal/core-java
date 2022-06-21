class Garden {
static String type = " botanical gardens";
String name;
String location; 
String openingTime; 
String closingTime;
String area;

public Garden (String name,String location, String openingTime,String closingTime, String area) {
this.name=name;
this.location = location;
this.openingTime = openingTime;
this.closingTime = closingTime;
this.area = area; 
}

public static void main (String a[]) {

Garden gar = new Garden ("lala bahadur shasatri","almatti","9.00am","5.00pm","140acre");
System.out.println("garden name :" +gar.name + "   Location : "+gar.location+"  OpeningTime : "+gar.openingTime+"  ClosingTime : "+gar.closingTime+"  Area : "+gar.area);
System.out.println("Garden type  :" + Garden.type);
System.out.println("  ");

Garden gar1 = new Garden ("lalbagh","Bangalore","9.00am","6.00pm","300acre");
System.out.println("garden name :" +gar1.name + "   Location : "+gar1.location+"  OpeningTime : "+gar1.openingTime+"  ClosingTime : "+gar1.closingTime+"  Area : "+gar1.area);
System.out.println("Garden type  :" + Garden.type);
System.out.println("  ");


Garden gar2 = new Garden ("mahatma gandhi","gkvk-bangalore","8:30am","4.00pm","80acre");
System.out.println("garden name :" +gar2.name + "   Location : "+gar2.location+"  OpeningTime : "+gar2.openingTime+"  ClosingTime : "+gar2.closingTime+"  Area : "+gar2.area);
System.out.println("Garden type  :" + Garden.type);
System.out.println("  ");

}
}