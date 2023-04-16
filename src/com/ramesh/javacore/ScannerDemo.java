package com.ramesh.javacore;

import java.util.Scanner;
public class ScannerDemo {

	
	int practHrs;
	String result;
	
	public void hello()
	{
		System.out.println(practHrs + " " + result);
	}
	
public static void main(String[] args) {
	ScannerDemo demo = new ScannerDemo();
	System.out.println("enter your practice hours");
	Scanner scanner = new Scanner(System.in);
	int practice = scanner.nextInt();
	System.out.println("enter the result");
    
	String res = scanner.next(); //we want to read the values so we can use scanner.next()
	
	demo.practHrs = practice;
	demo.result = res;
	demo.hello();
	
	//demo.hello();
	
}

}
