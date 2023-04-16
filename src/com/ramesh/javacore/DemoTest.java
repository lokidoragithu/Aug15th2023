package com.ramesh.javacore;

public class DemoTest {
	public int addition(int num1,int num2) {
		int result = num1+num2;
		System.out.println("Result is:" +result);
		return result;
	}

	public float addition(float num1,float num2) {
		float result = num1+num2;
		System.out.println("float float Result is:" +result);
		return result;
	}
	
	
	public double addition(double num1,double num2) {
		double result = num1+num2;
		System.out.println("double double Result is:" +result);
		return result;
	}

	public static class Demo{
		public static void main (String[] args) {
			DemoTest test = new DemoTest();
			//test.addition(25,65);
			//test.addition(250.50f,650.50f);
			//test.addition(250.0,650.0);
			test.addition('a', 'b');
			
		}
	}

}
