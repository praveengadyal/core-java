class YesBank extends Bank1{

@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=3.0;
System.out.println("yes bank bank interst :" +interestRate);
}

}