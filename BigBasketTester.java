class BigBasketTester{

public static void main(String[] args){

BigBasketDTO bb=new BigBasketDTO();
bb.setId(973);
bb.setRatings(4.5);
bb.setType("online-chain");
bb.setService("grocery shopping");
bb.setRevenue("6558 cr");


System.out.println(bb.getId()+"  "+bb.getRatings()+"  "+bb.getType()+"  "+bb.getService()+"  "+bb.getRevenue());
}



}