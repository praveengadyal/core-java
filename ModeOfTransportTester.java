class ModeOfTransportTester{


public static void main(String a[]){

Bus b=new Bus();
b.id=123;
b.capacity=64;
b.fuel="petrol";
b.chargesPerKM=10;
b.type="land";
b.operatedBy="public sector";
b.toMove();
System.out.println(b.id+"  "+ b.capacity +"   "+b.fuel +"   "+ b.chargesPerKM +"   "+ b.type +"   "+ b.operatedBy);
}
}