class CanaraBank extends Bank1{
@Override
public void rateOfInterest(){
super.rateOfInterest();
interestRate=7.2;
System.out.println("canara bank interest :" +interestRate);
}
}