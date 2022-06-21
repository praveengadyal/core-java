class PetrolBunk{

int id;
String name;
static String vat="20%";
String type;
static int totalNum=60799;
float price;

public PetrolBunk(int id,String name,String type,float price){
this.id=id;
this.name=name;
this.type=type;
this.price=price;
}
 
public static void main(String ... a){

PetrolBunk pb=new PetrolBunk(333,"H.P.C ltd","govt",101.94f);
System.out.println("id :"+pb.id + "  name of petrolbunk :"+pb.name + "  owned by :"+pb.type +  "   present price of petrol :"+pb.price );
System.out.println("vat on petroleum produts in india :"+PetrolBunk.vat + "   total number of petrol bunks across india :"+PetrolBunk.totalNum);

System.out.println("");

PetrolBunk pb1=new PetrolBunk(999,"B.P.C ltd","govt",106.03f);
System.out.println("id :"+pb1.id + "  name of petrolbunk :"+pb1.name + "  owned by :"+pb1.type +  "   present price of petrol :"+pb1.price );
System.out.println("vat on petroleum produts in india :"+PetrolBunk.vat + "   total number of petrol bunks across india :"+PetrolBunk.totalNum);

System.out.println("");

PetrolBunk pb2=new PetrolBunk(894,"indian oil","govt",111.35f);
System.out.println("id :"+pb2.id + "  name of petrolbunk :"+pb2.name + "  owned by :"+pb2.type +  "   present price of petrol :"+pb2.price );
System.out.println("vat on petroleum produts in india :"+PetrolBunk.vat + "   total number of petrol bunks across india :"+PetrolBunk.totalNum);

System.out.println("");

PetrolBunk pb3=new PetrolBunk(1001,"reliance petroleum","private",105.7f);
System.out.println("id :"+pb3.id + "  name of petrolbunk :"+pb3.name + "  owned by :"+pb3.type +  "   present price of petrol :"+pb3.price );
System.out.println("vat on petroleum produts in india :"+PetrolBunk.vat + "   total number of petrol bunks across india :"+PetrolBunk.totalNum);
}
}