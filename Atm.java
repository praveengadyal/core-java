class Atm{

String branch;
int id;
int noOfMachines;
String type;

public Atm(){
System.out.println("atm is created");
}

public static void main(String ... b){

Atm a=new Atm();
a.branch="IndusInd";
a.id=3565;
a.noOfMachines=2;
a.type="withdraw";

System.out.println("branch : " + a.branch);
System.out.println("atm id : " + a.id);
System.out.println("number of machines : " + a.noOfMachines);
System.out.println("type of atm : " + a.type);

System.out.println("");

Atm a1=new Atm();
a1.branch="HDFC";
a1.id=4527;
a1.noOfMachines=2;
a1.type="deposite n withdraw";

System.out.println("branch : " + a1.branch);
System.out.println("atm id : " + a1.id);
System.out.println("number of machines : " + a1.noOfMachines);
System.out.println("type of atm : " + a1.type);

System.out.println("");

Atm a2=new Atm();
a2.branch="SBI";
a2.id=2435;
a2.noOfMachines=3;
a2.type="deposite n withdraw";

System.out.println("branch : " + a2.branch);
System.out.println("atm id : " + a2.id);
System.out.println("number of machines : " + a2.noOfMachines);
System.out.println("type of atm : " + a2.type);

System.out.println("");

Atm a3=new Atm();
a3.branch="ICICI";
a3.id=245;
a3.noOfMachines=2;
a3.type="deposite n withdraw";

System.out.println("branch : " + a3.branch);
System.out.println("atm id : " + a3.id);
System.out.println("number of machines : " + a3.noOfMachines);
System.out.println("type of atm : " + a3.type);
}
}