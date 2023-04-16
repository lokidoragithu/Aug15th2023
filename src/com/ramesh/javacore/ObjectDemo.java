package com.ramesh.javacore;

public class ObjectDemo {
	int practHrs;
	String result;
	public void hello() {
		System.out.println(practHrs + " " + result  );
	}
public static void main(String[] args) {
	ObjectDemo demo = new ObjectDemo();
	demo.practHrs = 9;
	demo.result = "job";
	demo.hello();	
}
}
