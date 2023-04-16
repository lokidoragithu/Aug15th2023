package com.ramesh.javacore;


class PojoDemo
{
	private int practHrs = 9;
	private String name = "job";
	private static double sal =125000.45;
	
    public int getpractHrs() {
    	return practHrs;
    }
    
    public String getname() {
    	return name;
    }
    
    public double getsal() {
    	return sal;
    }
}

public class Pojotest {
	public static void main(String[] args) {
		PojoDemo demo = new PojoDemo ();
		//int resp = demo.PractHrs;//practHrs is a private variable so private variables are cant access out side the class so we need to create getter and setter method.
		
		int practHrsResp = demo.getpractHrs();
		System.out.println(practHrsResp);
		
		String nameResp = demo.getname();
		System.out.println(nameResp);
		
		double salResp = demo.getsal();
		System.out.println(salResp);
		
	}

}
