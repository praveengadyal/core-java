class UserLogin{

public static void main(String ... a){

long number=phoneNumber(7353395193L);
System.out.println("login using number " + number);

String id=eMail("praveengadyal.xworkz@gamil.com");
System.out.println("login using mail id " + id);
}

public static long phoneNumber(long number){
System.out.println("invoking phonenumber method");
return number;
}
public static String eMail(String id){
System.out.println("invoking email method");
return id;
}
}