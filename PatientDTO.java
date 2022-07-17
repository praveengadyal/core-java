class PatientDTO{

public PatientDTO(){
System.out.println("patientDTO const");
}
/*
@Override
public int hashCode(){
return this.id;
}
*/

private int id;
private String name;
private String contactNo;
private String address;
private Gender gender;


public int getId(){return id;}

public void setId(int id){this.id=id;}

public String getName(){return name;}

public void setName(String name){this.name=name;}

public String getContactNo(){return contactNo;}

public void setContactNo(String contactNo){this.contactNo=contactNo;}

public String getAddress(){return address;}

public void setAddress(String address){this.address=address;}

public Gender getGender(){return gender;}

public void setGender(Gender gender){this.gender=gender;}

@Override
public String toString(){
return "[PatientDTOx : id="+ this.id+", name="+ this.name+", contactNo="+ this.contactNo+", address="+this.address+", gender="+this.gender+"]";
}

}