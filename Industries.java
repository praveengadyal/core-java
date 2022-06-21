class Industries{

int id;
int noOfWorkers;
String name;
static String rev="103 billion dollars";
String location;
String type;
 static String companyName="TATA Group";
static String hQ="bombay house";

public Industries(int ident, int no, String nam, String loca, String typ){
id=ident;
noOfWorkers=no;
name=nam;
location=loca;
type=typ;

}

public static void main(String ... a){
 Industries in=new Industries(13, 59000, "tata motors", "170 countries", "automobile");
 System.out.println("id :"+in.id + "  number of workers :"+in.noOfWorkers + "   name :"+in.name + "  operates in :"+in.location + "   sector :"+in.type );
System.out.println("company :"+Industries.companyName + "  headquarters :"+Industries.hQ + "  company revenue :"+Industries.rev);

System.out.println("");

Industries in1=new Industries(104, 12085, "Air India", "31 countries", "aviation");
 System.out.println("id :"+in1.id + "  number of workers :"+in1.noOfWorkers + "   name :"+in1.name + "  operates in :"+in1.location + "   sector :"+in1.type );
System.out.println("company :"+Industries.companyName + "  headquarters :"+Industries.hQ + "  company revenue :"+Industries.rev);

System.out.println("");

Industries in2=new Industries(1331, 8613, "tata power", "5 countries", "power");
 System.out.println("id :"+in2.id + "  number of workers :"+in2.noOfWorkers + "   name :"+in2.name + "  operates in :"+in2.location + "   sector :"+in2.type );
System.out.println("company :"+Industries.companyName + "  headquarters :"+Industries.hQ + "  company revenue :"+Industries.rev);

System.out.println("");

Industries in3=new Industries(111, 5000, "croma", "india", "retail chain");
 System.out.println("id :"+in3.id + "  number of workers :"+in3.noOfWorkers + "   name :"+in3.name + "  operates in :"+in3.location + "   sector :"+in3.type );
System.out.println("company :"+Industries.companyName + "  headquarters :"+Industries.hQ + "  company revenue :"+Industries.rev);
}
}