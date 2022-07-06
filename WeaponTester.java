class WeaponTester{

public static void main(String[] args){

Weapon w=new Weapon();
w.setId(47);
w.setName("AK-47");
w.setProducedBy("KALASHNIKOV Concern n Norinco");
w.setRateOfFire(600);
w.setType("automatic rifles");

System.out.println(w.getId()+"   "+w.getName()+"   "+w.getProducedBy()+"   "+w.getRateOfFire()+"   "+w.getType());
}

}