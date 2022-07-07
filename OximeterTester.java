class OximeterTester{


public static void main(String[] args){

OximeterDTO om=new OximeterDTO();
om.setId(119);
om.setName("Dr trust");
om.setPrice(1299);
om.setReview(4.5);
om.setModel("signature series-201");

System.out.println(om.getId()+"  "+om.getName()+"  "+om.getPrice()+"  "+om.getReview()+"  "+om.getModel());

}


}