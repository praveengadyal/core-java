package com.xworkz.block;

public class WrapperDemoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WrapperDemo wd=new WrapperDemo();
		wd.setWarranty((byte) 2);
		wd.setNo((short) 133);
		wd.setId(1);
		wd.setContactNo(1234567891l);
		wd.setName("xyz-product");
		wd.setNum(33.33f);
		wd.setPrice(40000.00);
		wd.setIsGood(false);
		

		
		//Boxing
		Integer id=wd.getId(); 
		
		//unboxing
		int idI = id.intValue();
		byte idB= id.byteValue();//down-casting
		short idS=id.shortValue();//down-casting
		long idL=id.longValue();
		float idF=id.floatValue();
		double idD=id.doubleValue();
		char idC=(char) id.intValue();
		
		System.out.println(idI+"  "+idB+"  "+idS+" "+idL+" "+idF+" "+idD+" "+idC);
		
		
		
		Long contactNo=wd.getContactNo();
		long contactNoL=contactNo.longValue();
		int contactNoI=contactNo.intValue();
		byte contactNoB=contactNo.byteValue();
		short contactNoS=contactNo.shortValue();
		float contactNoF=contactNo.floatValue();
		double contactNoD=contactNo.doubleValue();
		char contactNoC=(char) contactNo.longValue();
		
		System.out.println(contactNoL+"  "+contactNoI+"  "+contactNoB+" "+contactNoS+" "+contactNoF+" "+contactNoD+" "+contactNoC);
		
		
		Byte warranty=wd.getWarranty();
		byte warrantyB=warranty.byteValue();
		short warrantyS=warranty.shortValue();
		int warrantyI=warranty.intValue();
		long warrantyL=warranty.longValue();
		float warrantyF=warranty.floatValue();
		double warrantyD=warranty.doubleValue();
		char warrantyC=(char) warranty.intValue();
		
		System.out.println(warrantyB+"  "+warrantyS+"  "+warrantyI+" "+warrantyL+" "+warrantyF+" "+warrantyD+" "+contactNoC);
		
		Short no=wd.getNo();
		byte noB=no.byteValue();
		short noS=no.shortValue();
		int noI=no.intValue();
		long noL=no.longValue();
		float noF=no.floatValue();
		double noD=no.doubleValue();
		char noC=(char) no.intValue();
		
		System.out.println(noB+"  "+noS+"  "+noI+" "+noL+" "+noF+" "+noD+" "+noC);

		
		Float num=wd.getNum();
		float numF=num.floatValue();
		byte numB=num.byteValue();
		short numS=num.shortValue();
		int numI=num.intValue();
		long numL=num.longValue();
		double numD=num.doubleValue();
		char numC=(char) num.floatValue();
		
		System.out.println(numF+"  "+numB+"  "+numS+" "+numI+" "+numL+" "+numD+" "+numC);

		
		Double price=wd.getPrice();
		double priceD=price.doubleValue();
		byte priceB=price.byteValue();
		short priceS=price.shortValue();
		int priceI=price.intValue();
		long priceL=price.longValue();
		float priceF=price.floatValue();
		char priceC=(char) price.doubleValue();
		
		System.out.println(priceD+"  "+priceB+"  "+priceS+" "+priceI+" "+priceL+" "+priceF+" "+priceC);

		
		
		
		
		Boolean isGood=wd.getIsGood();
		boolean isGood1=isGood.booleanValue();
		
	

		Integer baba=78;
		
		Long baba1=78l;
		//System.out.println(baba==baba1.intValue());

	}

}


