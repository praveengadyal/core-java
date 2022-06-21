class Addition{

public static void main(String args[]){

int finalValue=add(55,55);
System.out.println(finalValue);
//int add(80,57);
//int add(39,78);
add(55,76,34);

}

public static int  add(int a,int b){

return(a+b);
}
static void  add(int a,int b,int c){

System.out.println(a+b+c);
}

}

//in method overloading return type not matter