class Kotak extends Bank1{

@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=8.0;
System.out.println("Kotak bank rate of interest is :" +interestRate);
}

}