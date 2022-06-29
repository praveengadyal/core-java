class Axis extends Bank1{

@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=4.0;
System.out.println("AXIS bank rate of interest :" +interestRate);
}

}