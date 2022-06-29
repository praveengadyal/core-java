class LifeInsuranceCompanyTester{


public static void main(String a[]){

LIC l=new LIC();

l.stockPrice=661.30;
l.customerService="02268276827";
l.chairPerson="M R Kumar";
l.founded="01 september 1956";
l.headQuarters="mumbai";
l.type="public sector";
l.revenue="7.25 lakh cr";
l.provideLoan();
l.financialCoverage();

System.out.println(l.stockPrice+"   "+l.customerService+"    "+l.chairPerson+"   "+l.founded+"    "+l.headQuarters+"    "+l.type+"    "+l.revenue);
}
}