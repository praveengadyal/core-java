
import java.util.Scanner;
class AirportxTester{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of Terminal to be Added");
int size=sc.nextInt();

Airportx a=new Airportx(size);


for(int i=0;i<size;i++){

TerminalDTO dto=new TerminalDTO();
System.out.println("enter the Terminal id");
int id=sc.nextInt();
System.out.println("enter the Terminalname ");
String terminalName=sc.next();
System.out.println("enter the Terminal noOfTerminal");
int noOfTerminal=sc.nextInt();
System.out.println("enter the Terminal is type");
String type=sc.next();

dto.setId(id);
dto.setTerminalName(terminalName);
dto.setNoOfTerminal(noOfTerminal);
dto.setType(type);
a.creatTerminal(dto);
}

String option=null;

do{

System.out.println("enter the 1 to getTerminalDetails.....");
System.out.println("enter the 2 to getTerminalDetailsById.....");
System.out.println("enter the 3 to updateNoOfTerminalById.....");
System.out.println("enter the 4 to updateTypeByTerminalName.....");
System.out.println("enter the 5 to deleteTerminalById.....");
System.out.println("enter the 6 to deleteTerminalByType.....");
System.out.println("enter the number to perform above metioned task...");
int choice=sc.nextInt();

switch(choice){

case 1: a.getTerminalDetails();
break;

case 2: System.out.println("enter the Id with which you want get all details of that object...");
int exId=sc.nextInt();
a.getTerminalDetailsById(exId);
break;

case 3: System.out.println("provide Id with which you want to update.....");
int id1=sc.nextInt();
System.out.println("enter the updated noOfTerminal.....");
int noOfTerminal1=sc.nextInt();
a.updateNoOfTerminalById(id1,noOfTerminal1);
a.getTerminalDetails();
break;


case 4:System.out.println("provide the terminalName with which you want to update.... ");
String terminalName1=sc.next();
System.out.println("enter the updated type");
String type1=sc.next();
a.updateTypeByTerminalName(terminalName1,type1);
a.getTerminalDetails();
break;


case 5: System.out.println("enter the Id with which you want to deleted....");
int id=sc.nextInt();
a.deleteTerminalById(id);
a.getTerminalDetails();
break;


case 6: System.out.println("enter the type with which you want to delete......");
String type=sc.next();
a.deleteTerminalByType(type);
a.getTerminalDetails();
break;
 
default : System.out.println("invalid number ....provide propare number");
break;


}
System.out.println("enter---- yes to continue and no to exit");
option=sc.next();


}while(option.equals("yes"));


}
}


/*
a.getTerminalDetails();


System.out.println("provide Id with which you want to update.....");
int id1=sc.nextInt();
System.out.println("enter the updated noOfTerminal.....");
int noOfTerminal1=sc.nextInt();
a.updateNoOfTerminalById(id1,noOfTerminal1);
a.getTerminalDetails();

System.out.println("provide the terminalName with which you want to update.... ");
String terminalName1=sc.next();
System.out.println("enter the updated type");
String type1=sc.next();
a.updateTypeByTerminalName(terminalName1,type1);
a.getTerminalDetails();

System.out.println("enter the Id with which you want to deleted....");
int id=sc.nextInt();
a.deleteTerminalById(id);
a.getTerminalDetails();

System.out.println("enter the type with which you want to delete......");
String type=sc.next();
a.deleteTerminalByType(type);
a.getTerminalDetails();
*/

