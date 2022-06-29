class DCCBank extends Bank1{

@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=7.6;
System.out.println("dcc bank rate of interest :" +interestRate);
}

}