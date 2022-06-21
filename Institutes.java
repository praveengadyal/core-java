class Institutes{

int id;
String name;
String courses;
int noOfStuff;
int students;
static int noOfBranches=2;
static String n="praveen";


public Institutes(){
System.out.println("object created");
}

public Institutes(int id,String name,String courses,int noOfStuff,int students){
this.id=id;
this.name=name;
this.courses=courses;
this.noOfStuff=noOfStuff;
this.students=students;
}

public static void main(String ... a){

Institutes ins=new Institutes(123,"xworkz","java",20,100);
System.out.println("id :" +ins.id + "  name :" +ins.name + "  courses :" +ins.courses + "  number of stuff :" +ins.noOfStuff + "  number of students :" +ins.students);
System.out.println( Institutes.n +":i am one of the students " +  "   number of branches of institutes :" +Institutes.noOfBranches );

System.out.println("");

Institutes in=new Institutes(34,"S.G.Balekundri","EEE",200,3000);
System.out.println("id :" +in.id + "  name :" +in.name + "  courses :" +in.courses + "  number of stuff :" +in.noOfStuff + "  number of students :" +in.students);
System.out.println( Institutes.n +":i am one of the students " +  "   number of branches of institutes :" +Institutes.noOfBranches );

System.out.println("");

Institutes in1=new Institutes(547,"P.B","schooling",60,1000);
System.out.println("id :" +in1.id + "  name :" +in1.name + "  courses :" +in1.courses + "  number of stuff :" +in1.noOfStuff + "  number of students :" +in1.students);
System.out.println( Institutes.n +":i am one of the students " +  "   number of branches of institutes :" +Institutes.noOfBranches );

}
}