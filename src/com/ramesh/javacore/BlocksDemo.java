package com.ramesh.javacore;

class BlockTest //here static blocks are not going to be executed when we are extends like this (BlocksDemo extends BlockTest) then it will executed. 
{
	static
	{
		System.out.println("PC:SB1");
	}
	
	static
	{
		System.out.println("PC:SB2");
	}
	
	static
	{
		System.out.println("PC:SB3");
	}
	
	{
		System.out.println("PC:IB1");//I means instance block, pc=parent class
	}
	public BlockTest()
	{
		System.out.println("CC:Default constructor");
	}
	
	
}
public class BlocksDemo extends BlockTest  {

	
	{
		System.out.println("CC:IB1");// cc=child class, i means instance block,
	}
	
	static
	{
		System.out.println("CC:SB1");
	}
	
	static
	{
		System.out.println("CC:SB2");
	}
	
	static
	{
		System.out.println("CC:SB3");
	}
	public BlocksDemo() //this is called constroctor
	{
		System.out.println("PC:Default constructor");
	}
	public static void main(String[] args) {
		//when we are creating object on that time instance blocks are going to be executed.
		BlocksDemo demo = new BlocksDemo();
	}
}
