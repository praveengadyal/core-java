package com.xworkz.block;

public class BlocksTester {
	
	

	public BlocksTester() {
		System.out.println("in BlocksTester........");
		
	}
	
	static
	{
		System.out.println("BlockTester block.....static block");
	}
	
	{
		System.out.println("BlockTester block.....1 inst");
	}

	{
		System.out.println("BlockTester block.....2 inst");
	}
	public static void main(String[] args) {
		
		
		Blocks b=new Blocks();

	}

}
