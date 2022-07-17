import java.util.Arrays;
class Hospitalx{


PatientDTO[] dtos; 

int index;

public Hospitalx(int size){
dtos=new PatientDTO[size];
System.out.println("inside hospital const");
}


public boolean creatPatient(PatientDTO dto){
System.out.println("inside creat patient method");
boolean isAdded=false;
if(dto!=null && dto.getName()!=null){
 this.dtos[index++]=dto;
  isAdded=true;
System.out.println("patient data is Added succefully.....");
}
else{
  System.out.println("no patient added ....");
}
return isAdded;
}


public void getPatientDetails(){
System.out.println("inside get patient deatils method");
for(int i=0;i<dtos.length;i++){
 System.out.println(dtos[i]);
}
}

public PatientDTO getPatientDetailsById(int id){
System.out.println("inside getPatientDetailsById()");
PatientDTO patientDTO=null;
for(int i=0;i<dtos.length;i++){
if(dtos[i].getId()==id){
System.out.println(patientDTO=dtos[i]);
}
}
return patientDTO;
}

public String getPatientNameById(int id){
System.out.println("inside getPatientNameById()");
String name=null;
for(int i=0;i<dtos.length;i++){
if(dtos[i].getId()==id){
     name=dtos[i].getName();
}else{
System.out.println("provided Id is not matching....");
}
}
return name;
}
 
public String getPatientContactNoByName(String name){
System.out.println("inside getPatientContactNoByName()");
String contactNo=null;
for(int i=0;i<dtos.length;i++){
if(dtos[i].getName().equals(name)){
    contactNo=dtos[i].getContactNo();
}else{
System.out.println("provided Name is not matching.....");
}
}
return contactNo;
}


public  boolean updatePatientAddressById(int id,String address){
System.out.println("inside updatePatientAddressById()");
boolean updateAddress=false;
for(int i=0;i<dtos.length;i++){
    if(dtos[i].getId()==id){
        dtos[i].setAddress(address);
         updateAddress=true;
}
else{
   System.out.println("No patient with this id ....plz make sure that you have propare id");
}
}
return updateAddress;
}

public boolean updatePatientContactNoByName(String name,String contactNo){
System.out.println("inside updatePatientContactNoByName()");
boolean updateContactNo=false;
for(int i=0;i<dtos.length;i++){
   if (dtos[i].getName().equals(name)){
         dtos[i].setContactNo(contactNo);
         updateContactNo=true;
}
else{
System.out.println("no patient with this name....plz make sure you provide correct name");
}
}
return updateContactNo;
}

public boolean deletePatientByName(String name){
System.out.println("inside deletePatientByName()");
boolean patientDeleted=false;
int i,j;
for(i=0,j=0;j<dtos.length;j++){
    if(!dtos[j].getName().equals(name)){

       dtos[i++]=dtos[j];
        //dtos[i]=null;
        patientDeleted=true;
}else{
System.out.println("provided name is not present so it is not possible to delete .........");
}
}
dtos=Arrays.copyOf(dtos,i);
return patientDeleted;
}


public boolean deletePatientById(int id){
System.out.println("inside deletePatientById()");
boolean patientDeleted=false;
int i,j;
for(i=0,j=0;j<dtos.length;j++){
if(dtos[j].getId()!=id){
dtos[i++]=dtos[j];
patientDeleted=true;
}else{
System.out.println("provided Id is not present so it is not possible to delete.........");
}
}
dtos=Arrays.copyOf(dtos,i);
return patientDeleted;
}


public boolean deletePatientByGender(Gender gender){
System.out.println("deletePatientByGender");
boolean patientDeleted=false;
int newIndex,oldIndex;
for(newIndex=0,oldIndex=0;oldIndex<dtos.length;oldIndex++){
    if(dtos[oldIndex].getGender()!=gender){
          dtos[newIndex++]=dtos[oldIndex];
           patientDeleted=true;
}else{
System.out.println("provided correct information........");
}
}
dtos=Arrays.copyOf(dtos,newIndex);
return patientDeleted;
}


}











