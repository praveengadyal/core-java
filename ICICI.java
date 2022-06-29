class ICICI extends Bank1{

@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=9.0;
System.out.println("ICICI bank rate of interest :" +interestRate);
}
}