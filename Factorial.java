class Factorial{
public static void main(String...a){
int r;
//int ncr=fact(n)/fact(r)*fact(n-r);
//int npr=fact(n)/fact(n-r);
int npr=fact(5)/fact(5-2);
int ncr=(fact(5))/(fact(2)*fact(5-2));
int factValue=fact(5);
System.out.println("factorial is " + factValue);
System.out.println(" npr is " + npr);
System.out.println("ncr is "+ ncr);
}




public static int fact(int factNumber){
int f=1;
for(int i=1;i<=factNumber;i++){
f=f*i;
}
return f;
}

/*public  static int permutation(int n,int r){

int per=fact(n)/fact(n-r);
return per;
}

public static int combination(int n,int r){
int com=fact(n)/fact(n-r)*fact(r);
return com;
}*/
}