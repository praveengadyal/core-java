class StadiumTester{

public static void main(String[] args){

Stadium s=new Stadium();
s.setId(448);
s.setName("sardar vallabhai patel ");
s.setCity("ahmedabad");
s.setCapacity(13200);
s.setType("cricket stadium");

System.out.println(s.getId()+"  "+s.getName()+"  "+s.getCity()+"  "+s.getCapacity()+"  "+s.getType());
}

}