class AccountTester{

public static void main(String args[]){


SavingsAccount sa=new SavingsAccount(15.00);
sa.deposite(5000.00);
sa.withDraw(500.00);
double amount=sa.getBalance();
//sa.periodicInterest();
System.out.println("balance of existing account :" + amount);

System.out.println(" --------------------------------------------------------------");

SavingsAccount other=new SavingsAccount(0.3);
sa.transfer(3000.00,other);

double totalAmount=other.getBalance();
System.out.println("balance of other Account :" + totalAmount);

System.out.println("------------------------------------------------------------------ ");

CurrentAccount ca=new CurrentAccount();
ca.deposite(5000.00);
ca.withDraw(2000.00);
ca.deposite(3000.00);
ca.withDraw(2000.00);
ca.withDraw(800.00);
System.out.println("--------------------");
/*ca.periodicInterest();
double amount1=ca.getBalance();
System.out.println("balance of exiting account :" + amount1);
System.out.println("---------------------");
ca.transfer(1000.00,other);
double totalAmount1=other.getBalance();
System.out.println("balance of other account :" + totalAmount1);*/

}


}