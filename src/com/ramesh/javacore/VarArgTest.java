package com.ramesh.javacore;
class VarArgDemo{
	public void hello(int i, String... str) {
		System.out.println("var arg method");
	}
	public void hello(int i) {
		System.out.println("int parameter");
	}
}


public class VarArgTest {
public static void main(String[] args) {
	VarArgDemo demo = new VarArgDemo();
	demo.hello(456);
	demo.hello(91456,"java");
	//demo.hello("java", "job");
	//demo.hello("java","job","selenium","haedwork");
	
	
}

}
