class CurrentAccount extends BankAccount{

static int count=0;
static int freeTranscation=2;
static int transcationFee=100;
/*double interest;
public CurrentAccount(double interest){
this.interestRate=interestRate;
}*/

public double deposite(double amt){
System.out.println("invoked deposite()");
System.out.println("the amount before deposite :"+ amount);
System.out.println("the amout to be deposited :"+ amt);
amount=amount + amt;
System.out.println("amount after deposite :"+ amount);
System.out.println("end of deposite()");
System.out.println("number of transcation done" +   ++count);
transcationCharge();
return amount;
}


public double withDraw(double amt){
System.out.println("invoked withdraw()");
System.out.println("the amount before withdraw :"+ amount);
System.out.println("the amount to be withdrawn :"+ amt);
amount=amount-amt;
System.out.println("after withdrawn :"+ amount);
System.out.println("end");
System.out.println("number of transcation done" +   ++count);
transcationCharge();
return amount;
}

public double transcationCharge(){

if (count>freeTranscation){
System.out.println("transcation limit exceeds charges will be deducted from your Account");
amount=amount-transcationFee;
System.out.println("amount after fee deduction :" + amount);
}

else {
System.out.println(" amount not deducted");
}
return amount;
}
/*
public double periodicInterest(){

double interest= getBalance()*interestRate/100;
deposite(interest);
return interest;

}*/
}