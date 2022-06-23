class Gun{

String company;
String mName;
String type;
float weight;
int length;
int rateOfFire;

public Gun(String company,String mName,String type,float weight,int length,int rateOfFire){
this();
this.company=company;
this.mName=mName;
this.type=type;
this.weight=weight;
this.length=length;
this.rateOfFire=rateOfFire;
System.out.println("object is created :parameterized");

}

public Gun(){
this.shot();
System.out.println("object is created : default");
}

public void shot(){
System.out.println("firing");
}

public static void main(String a[]){

Gun gun=new Gun("kalashnikov concern","AK-47","rifel",4.78f,87,600);
System.out.println("manufacturer :"+gun.company +"  weapon :"+gun.mName + "  type :"+gun.type + "  weight kg :"+gun.weight + "  length cm :"+gun.length + "  rounds/mintue :"+gun.rateOfFire);


}
}