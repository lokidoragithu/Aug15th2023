package com.ramesh.javacore;

class ConstructorDemo
{
	public  ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	
	/*private ConstructorDemo()  // when we are using the Constructor as a private we cant create object out side the class we can create object inside the class only otherwise we will get error.
	{
		System.out.println("Default Constructor");
	}*/
	
	/*public void hello() {
		ConstructorDemo demo = new ConstructorDemo();// here Constructor is going to be executed or not? yes it is executing.

	}*/
	
	public void hello() {
		System.out.println("hello");
}
}

public class ConstructorsDemo {
public static void main(String[] args) {
	ConstructorDemo demo = new ConstructorDemo();
	demo.hello();
	//demo.ConstructorDemo();
}
}


