 class EncapsInst{

static String insName="xworkz";
//String branch;

/*public Institutes3(String branch){
this.branch=branch;

}
*/

public static void main(String a[]){

String courses="java";

Student stu=new Student();
stu.setStdName("praveen");
stu.setStdId(13);

System.out.println(stu.getStdName() +"   "+ stu.getStdId());
System.out.println(Institutes3.insName + "   "+courses);


}
}

class Student{

private String stdName;
private int stdId;

public void setStdName(String stdName){
this.stdName=stdName;
}

public void setStdId(int stdId){
this.stdId=stdId;
}


public String getStdName(){
return stdName;
}

public int getStdId(){
return stdId;
}
}