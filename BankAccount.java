class BankAccount{

  double amount;
/*
public static void main(String args[]){
System.out.println("the main method started");
deposite(6700);
deposite(4700);
withdraw(9000);
deposite(1200);
withdraw(6400);
withdraw(4000);
deposite(20000);
withdraw(9000);
withdraw(3000);
deposite(7000);
getTotalAmount();
}*/

public double deposite(double amt){
System.out.println("invoked deposite()");
System.out.println("the amount before deposite"+ amount);
System.out.println("the amout to be deposited"+amt);
amount=amount + amt;
System.out.println("amount after deposite"+amount);
System.out.println("end of deposite()");
return amount;
}


public double withDraw(double amt){
System.out.println("invoked withdraw()");
System.out.println("the amount before withdraw"+amount);
System.out.println("the amount to be withdrawn"+amt);
amount=amount-amt;
System.out.println("after withdrawn"+amount);
System.out.println("end");
return amount;
}

public double getBalance(){

return amount;
}

public void transfer(double amount,BankAccount other){
withDraw(amount);
other.deposite(amount);
}

}