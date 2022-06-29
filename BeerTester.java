class BeerTester{


public static void main(String a[]){

KingFisher kF=new KingFisher();
kF.price=180.00;
kF.alcoholicContent="8%";
kF.quantity="650ml";
kF.mfgDate="1 june 2022";
kF.expiry="best before 36 months";
kF.toCelebrate();

System.out.println(kF.price+"   "+kF.alcoholicContent+"    "+kF.quantity+"    "+kF.mfgDate+"   "+kF.expiry);
}
}