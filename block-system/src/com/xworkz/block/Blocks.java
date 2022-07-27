package com.xworkz.block;

public class Blocks {
	
	
	
	public Blocks() {
		System.out.println(this.getClass().getSimpleName() + "  Object is created....inside constructor");
	}
	
	static {
		System.out.println("inside static block");
	}

	int blockInIt;
	{
		System.out.println("inside 1 inst Block");
		blockInIt=10;
	}

	{
		System.out.println("inside 2 inst Block");
	}
	
	static {
		System.out.println("2.. static block");
	}
	
	{
		System.out.println("3....instance block");
	}
//	public static void main(String[] args) {
	//	System.out.println("starting point of main()");
	//	Blocks b=new Blocks();
	//	System.out.println(b.blockInIt);
	//	System.out.println("end of main()");
		

	//}

}
