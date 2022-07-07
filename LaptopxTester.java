class LaptopxTester{

public static void main(String[] args ){

LaptopxDTO l=new LaptopxDTO();
l.setSeries("vivo book 15");
l.setSize(39.62);
l.setColor("silver");
l.setCpu("celeron n4020");
l.setHardDisk(256);
l.setRam(8);
l.setPrice(27000);

System.out.println(l.getSeries() +" "+
l.getSize() +" "+
l.getColor() +" "+
l.getCpu() +" "+
l.getHardDisk() +" "+
l.getRam() +" "+
l.getPrice());
}
}

