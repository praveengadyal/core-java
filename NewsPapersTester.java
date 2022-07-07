class NewsPapersTester{

public static void main(String[] args){

NewsPapersDTO np=new NewsPapersDTO();
np.setId(990);
np.setName("The Hindu");
np.setPrice(9);
np.setOwnedBy("kasturi n sons");
np.setType("e-paper and hard-copy");

System.out.println(np.getId()+"  "+np.getName()+"  "+np.getPrice()+"  "+np.getOwnedBy()+"  "+np.getType());


}

}