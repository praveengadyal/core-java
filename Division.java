class Division
{
public static void main(String... a){
//double value=div(45.0,5.0,2.0);
//double value2=div(45,5);
System.out.println(div(45,5,3));
System.out.println(div(45,5));
}
public static double div(double x,double y){
return x/y;
}
public static double div(double x, double y,double z){
return x/y/z;
}
}