package com.ramesh.javacore;

interface OuterOneDemo
{
	void hardwork1();
	void hardwork2();
	
	interface InnerOne
	{
		void hardwork3();
		void hardwork2();
	}
}
class OuterOneImpl implements OuterOneDemo
{

	@Override
	public void hardwork1() {
		System.out.println("hardwork1");
	}

	@Override
	public void hardwork2() {
	System.out.println("hardwork2");
		
	}
	
}
class InnerOneImpl implements OuterOneDemo
{

	@Override
	public void hardwork1() {
		
		System.out.println("hardwork3");
	}

	@Override
	public void hardwork2() {
		
		System.out.println("hardwork4");
	}
	
}
class OuterInnerImpl implements OuterOneDemo,OuterOneDemo.InnerOne
{

	@Override
	public void hardwork3() {
		
		System.out.println("hardwork3");
	}

	@Override
	public void hardwork1() {
		
		System.out.println("hardwork1");
	}

	@Override
	public void hardwork2() {
		
		System.out.println("hardwork2");
	}

	
	
}
public class InnerInterfaceDemo {
public static void main(String[] args) {
	
}

}
