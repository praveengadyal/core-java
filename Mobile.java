class Mobile{

 String name;
 int id;
 int price;
 String colour;
 long num;
 String proName;
 
public Mobile(){
System.out.println("mobile created");
}

public static void main(String ... a){

Mobile mo=new Mobile();
mo.name="samsung s20";
mo.id=567;
mo.price=39990;
mo.colour="green";
mo.num=7353395193L;
mo.proName="snapdragon865";

System.out.println("mobile brand is " + mo.name);
System.out.println("mobile id is " + mo.id);
System.out.println("price of mobile : " + mo.price);
System.out.println("colour of mobile : "  + mo.colour);
System.out.println("mobile number is " + mo.num);
System.out.println("processor is : " + mo.proName);

System.out.println("");

Mobile mo1=new Mobile();
mo1.name="iphone 12";
mo1.id=878;
mo1.price=54000;
mo1.colour="blue";
mo1.num=7019436029L;
mo1.proName="a14 bionic";

System.out.println("mobile brand is " + mo1.name);
System.out.println("mobile id is " + mo1.id);
System.out.println("price of mobile : " + mo1.price);
System.out.println("colour of mobile : "  + mo1.colour);
System.out.println("mobile number is " + mo1.num);
System.out.println("processor is : " + mo1.proName);

System.out.println("");

Mobile mo2=new Mobile();
mo2.name="iqoo 7";
mo2.id=5667;
mo2.price=30000;
mo2.colour="storm black";
mo2.num=7553395192L;
mo2.proName="snapdargon 870";

System.out.println("mobile brand is " + mo2.name);
System.out.println("mobile id is " + mo2.id);
System.out.println("price of mobile : " + mo2.price);
System.out.println("colour of mobile : "  + mo2.colour);
System.out.println("mobile number is " + mo2.num);
System.out.println("processor is : " + mo2.proName);

System.out.println("");

Mobile mo3=new Mobile();
mo3.name="oneplus nord";
mo3.id=645;
mo3.price=20000;
mo3.colour="blue tide";
mo3.num=7019436028L;
mo3.proName="snapdargon";

System.out.println("mobile brand is " + mo3.name);
System.out.println("mobile id is " + mo3.id);
System.out.println("price of mobile : " + mo3.price);
System.out.println("colour of mobile : "  + mo3.colour);
System.out.println("mobile number is " + mo3.num);
System.out.println("processor is : " + mo3.proName);


}

}