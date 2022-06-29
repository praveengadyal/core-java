class BikeTester{


public static void main(String a[]){

Jawa jw=new Jawa();
jw.mileage=25;
jw.displacement="293cc";
jw.engineType="single cylinder,4 stroke,liquid cooled,DOHC";
jw.noOfCylinders=1;
jw.power="27.33PS";
jw.torque="27.02Nm";
jw.brake="disc";
jw.fuelCapacity=14;
jw.transport();
jw.sport();

System.out.println(jw.mileage +"    "+jw.displacement +"    "+jw.engineType +"    "+jw.noOfCylinders +"    "+jw.power +"    "+jw.torque +"    "+jw.brake +"    "+jw.fuelCapacity);
}
}