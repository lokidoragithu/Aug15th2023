package com.ramesh.javacore;

class OuterOne
{
	public void hardwork1() {
		System.out.println("OC:HW1");
	}
    static public void hardwork2()
    {
    	System.out.println("OC:HW2");
    
	}
	class InnerOne
	{
		public void hardwork3() {
			System.out.println("IC:HW3");

		}
		
	}
	
	static class InnerTwo
	{
		public void hardwork4() {
			System.out.println("IC:HW4");

		}
		static public void hardwork5() {
			System.out.println("SIC:HW5");

		}
	}
}
	


public class InnerClassesDemo {
	public static void main(String[] args) {
		/*OuterOne one = new OuterOne();
		one.hardwork1();
		one.hardwork2();
		OuterOne.hardwork2();*/
		
		/*OuterOne.InnerTwo two = new OuterOne.InnerTwo();  // this is for non static method, when it is a non static method we need to create object for that class.
		
		two.hardwork4();
		two.hardwork5();
		OuterOne.InnerTwo.hardwork5();*/  //this is for static method when we are going to access static method on that time we need to go for through class name (outerclassname.innerclass.staticmethod())
        
		OuterOne one = new OuterOne();
		OuterOne.InnerOne innerOne = one.new InnerOne();
		
		innerOne.hardwork3();
		
	}
}
