package com.ramesh.javacore;
class Constructorstest1
{
	int practHrs;
	String result;
	
	public Constructorstest1(int pract,String res)//here we are having class level variables names and constructor level local variables names are both different this. is not mandatory which is optional. 
	{
		practHrs = pract;//if you want to use this. no problem at all
		result = res ;
		System.out.println("Parameterised constructor");
	}
	public Constructorstest1()
	{
		System.out.println("Default constructor");
	}
	
	public Constructorstest1(int hrs)   //same constructor name with different perameters of this mechanisum is called @overload
	{
		System.out.println("1 PC: "+hrs);
	}
	
	public void hello()
	{
		System.out.println(practHrs+" "+result);
	}
}
public class ConstructorsDemo2
{
	public static void main(String[] args) {
		//Constructorstest1 test = new Constructorstest1(9,"JOB");
		//test.hello();
		
		//Constructorstest1 test1 = new Constructorstest1(15);
		Constructorstest1 test1 = new Constructorstest1('d'); // if the exact method match is not there it looks for automatic pramotions. it will goes for integers, meand after charector it will goes integers.
		
		
	}
}

