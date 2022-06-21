class Hospital{

int id;
int noOfDoctors;
String type;
String name;
String location;

public Hospital(){
System.out.println("hospital is created");
}

public static void main(String ... a){

Hospital hos=new Hospital();
hos.name="Ayu Health";
hos.id=244;
hos.noOfDoctors=30;
hos.type="super-speciality";
hos.location="malleshwaram";

System.out.println("Hospital name : " + hos.name);
System.out.println("Hospital id " + hos.id);
System.out.println("number of doctors in the Hospital : " + hos.noOfDoctors);
System.out.println(hos.type + " Hospital");
System.out.println("location of hospital " + hos.location);

System.out.println("");

Hospital hos1=new Hospital();
hos1.name="HCG";
hos1.id=6789;
hos1.noOfDoctors=15;
hos1.type="cancer care";
hos1.location="K.R Road";

System.out.println("Hospital name : " + hos1.name);
System.out.println("Hospital id " + hos1.id);
System.out.println("number of doctors in the Hospital : " + hos1.noOfDoctors);
System.out.println("Hospital for : " + hos1.type);
System.out.println("location of hospital " + hos1.location);

System.out.println("");

Hospital hos2=new Hospital();
hos2.name="kangaroo";
hos2.id=45;
hos2.noOfDoctors=25;
hos2.type="women n children";
hos2.location="vijayanagar";

System.out.println("Hospital name : " + hos2.name);
System.out.println("Hospital id " + hos2.id);
System.out.println("number of doctors in the Hospital : " + hos2.noOfDoctors);
System.out.println("Hospital for : " + hos2.type);
System.out.println("location of hospital " + hos2.location);

System.out.println("");

Hospital hos3=new Hospital();
hos3.name="cutis";
hos3.id=647;
hos3.noOfDoctors=18;
hos3.type="skin care";
hos3.location="hosahalli";

System.out.println("Hospital name : " + hos3.name);
System.out.println("Hospital id " + hos3.id);
System.out.println("number of doctors in the Hospital : " + hos3.noOfDoctors);
System.out.println("Hospital for : " + hos3.type);
System.out.println("location of hospital " + hos3.location);

}

}