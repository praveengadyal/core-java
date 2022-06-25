class RumTester{


public static void main(String a[]){

OldMonk monk=new OldMonk();
monk.price=440.00;
monk.alcoholicContent="42.7%";
monk.quantity="750ml";
monk.mfgDate="20 april 2022";
monk.expiry="best before 36 months";
monk.toGetKick();
System.out.println(monk.price+"   "+monk.alcoholicContent+"    "+monk.quantity+"   "+monk.mfgDate+"    "+monk.expiry);



}

}