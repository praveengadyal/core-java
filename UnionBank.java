class UnionBank extends Bank1{

@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=6.7;
System.out.println("union bank interest rate :" + interestRate);

}
}