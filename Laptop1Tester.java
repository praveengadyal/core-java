class Laptop1Tester{


public static void main(String args[]){


Asus a=new Asus();

a.series="vivo book 15";
a.size=39.62f;
a.color="silver";
a.cpu="celeron N4020";
a.hardDisk=256;
a.ram=8;
a.price=27000;
a.toPlayGames();
a.toEntertainment();
a.toCode();
System.out.println( "  series :"+a.series + "  size :"+a.size + "  color :"+a.color + "  cpu :"+a.cpu + "  hard disk :"+a.hardDisk + "  ram :"+a.ram  + "  price :"+a.price );


}


}
