import java.util.Arrays;
class Airportx{

TerminalDTO[] dtos;
int i;

public Airportx(int size){
dtos=new TerminalDTO[size];
System.out.println("inside the Airport const...........");
}

public boolean creatTerminal(TerminalDTO dto){
System.out.println("inside the creatTerminal method.....");
boolean isAdded=false;
if(dto!=null && dto.getTerminalName()!=null){
this.dtos[i++]=dto;
isAdded=true;
System.out.println("Terminal  added succesfully...");
}
else{
  System.out.println("no Terminal added...");
}
return isAdded;
}


public void getTerminalDetails(){
System.out.println("inside getTerminalDetails  method");

for(int i=0;i<dtos.length;i++){
 System.out.println(dtos[i]);
}
}

public TerminalDTO getTerminalDetailsById(int id){
System.out.println("inside getTerminalDetailsByAddress()");
TerminalDTO terminalDTO=null;
for(int i=0;i<dtos.length;i++){
if(dtos[i].getId()==id){
System.out.println(terminalDTO=dtos[i]);
}
}
return terminalDTO;
}



public  boolean updateNoOfTerminalById(int id,int noOfTerminal){
System.out.println("inside updateNoOfTerminalById()");
boolean updateNoOfTerminal=false;
for(int i=0;i<dtos.length;i++){
    if(dtos[i].getId()==id){
        dtos[i].setNoOfTerminal(noOfTerminal);
         updateNoOfTerminal=true;
}
else{
   System.out.println("No terminal with this id ....plz make sure that you have propare id");
}
}
return updateNoOfTerminal;
}

public boolean updateTypeByTerminalName(String terminalName,String type){
System.out.println("inside updateTypeByTerminalName()");
boolean updateType=false;
for(int i=0;i<dtos.length;i++){
   if (dtos[i].getTerminalName().equals(terminalName)){
         dtos[i].setType(type);
         updateType=true;
}
else{
System.out.println("no terminal with this name....plz make sure you provide correct terminalName");
}
}
return updateType;
}

public boolean deleteTerminalById(int id){
System.out.println("inside deleteTerminalById()");
boolean terminalDeleted=false;
int i,j;
for(i=0,j=0;j<dtos.length;j++){
if(dtos[j].getId()!=id){
dtos[i++]=dtos[j];
terminalDeleted=true;
}else{
System.out.println("no item is deleted ..plz see what happened");
}
}
dtos=Arrays.copyOf(dtos,i);
return terminalDeleted;
}

public boolean deleteTerminalByType(String type){
System.out.println("inside deleteTerminalByType()");
boolean terminalDeleted=false;
int i,j;
for(i=0,j=0;j<dtos.length;j++){
if(!dtos[j].getType().equals(type)){
   dtos[i++]=dtos[j];
   terminalDeleted=true;
}else{
System.out.println("provide propare information item not deleted");
}
}
dtos=Arrays.copyOf(dtos,i);
return terminalDeleted;
}
}




