class BankTester{


public static void main(String a[]){

SBI s=new SBI();
s.type="public sector";
s.headQuarters="mumbai";
s.branches=22219;
s.founded="01 july 1955";
s.areaServed="worldwide";
s.revenue="53 billion dollars";
s.noOfEmployees=245642; 
s.deposite();
s.withdraw();
s.provideLOan();

System.out.println( s.type+"   "+s.headQuarters+"    "+s.branches+"    "+s.founded+"    "+s.areaServed+"    "+s.revenue+"     "+s.noOfEmployees );
}
}