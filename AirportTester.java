class AirportTester{

public static void main(String[] args){

Airport a=new Airport();
a.setName("kempegowda Airport");
a.setType("International airport");
a.setLocation("bangalore");
a.setState("karnataka");
a.setId(9847);


System.out.println(a.getName()+"  "+a.getType()+"  "+a.getLocation()+"  "+a.getState()+"  "+a.getId());
}



}