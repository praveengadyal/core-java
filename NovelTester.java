class NovelTester{

public static void main(String[] args){

NovelDTO n=new NovelDTO();
n.setId(267);
n.setName("A Million Thoughts");
n.setWriter("ASTHA ANAND");
n.setUnitsSold(1000);
n.setPrice(150);

System.out.println(n.getId()+"  "+n.getName()+"  "+n.getWriter()+"  "+n.getUnitsSold()+"  "+n.getPrice());
}

}