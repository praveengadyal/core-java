class BankAccount{

 static double amount;

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
}

static void deposite(double amt){
System.out.println("invoked deposite()");
System.out.println("the amount before deposite"+ amount);
System.out.println("the amout to be deposited"+amt);
amount=amount + amt;
System.out.println("amount after deposite"+amount);
System.out.println("end of deposite()");
}


static void withdraw(double amt){
System.out.println("invoked withdraw()");
System.out.println("the amount before withdraw"+amount);
System.out.println("the amount to be withdrawn"+amt);
amount=amount-amt;
System.out.println("after withdrawn"+amount);
System.out.println("end");
}

static void getTotalAmount(){
System.out.println("the total balance is"+ amount);
}

}