package com.ramesh.javacore;

class ConstructorCallsTest  // here we are not creating object for this and also we are not calling otherwise it will executed,because of through super constructor call..
{
	public ConstructorCallsTest()  //here we are having constructor then compiler never generate the constructor
	{
		super(); //super refers parent class parameter.
		System.out.println("ConstructorCallsTest: DC");
	}
}
public class ConstructorCallsDemo extends ConstructorCallsTest{
public ConstructorCallsDemo()   //here we are having constructor then compiler never generate the constructor
{  //inside the constructor first statement is always super(),this()
	super(); //if we want we can right explicitly. your compiler is not going to place it.
	System.out.println("ConstructorCallsDemo: DC");
}
	
public static void main(String[] args) {
	ConstructorCallsDemo demo = new ConstructorCallsDemo(); //with this line executing default constructor its coming to above constructor(ConstructorCallsDemo),it is having parent class constructor ConstructorCallsTest(). so first ConstructorCallsTest()constructor going to be executed.then ConstructorCallsDemo() going to be executed. 
	
 
	}

}
