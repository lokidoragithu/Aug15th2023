package com.ramesh.javacore;

abstract class AbstractDemo{
	public void hardwork() {
		System.out.println("practice = job");
	}
	public void practice() {
		System.out.println("practice is must");
	}
	abstract public void job();
	abstract public void sal();
}
 abstract class AbstractDemoOne extends AbstractDemo{
	//here we have two options one is we can create abstract before the class another one is we can create unimplemented method like below ones.
	//abstract class AbstractDemoOne extends AbstractDemo
	@Override
	public void job() {
		System.out.println("job");
	}

	public void java() {
		System.out.println("its very important");//do i need to create any abstract  here no need at all.bec of this parent class having how many abstract methods two in the child class we are providing implementations for that abstract class.
	}
 }
	
	   class AbstractDemoTwo extends AbstractDemoOne{
		@Override
		public void sal() {
			System.out.println("salary");
			
		}
		public void career() {
			System.out.println("career");
			
		}
	
}

public class AbstractTest {
	public static void main(String[] args) {
	//here we can create abstract class bec of this is not a abstract class.
	//AbstractDemo demo = new AbstractDemo();
	//AbstractDemoOne demo = new AbstractDemo();
	//demo.hardwork();
	/*AbstractDemoTwo demo = new AbstractDemoTwo();
	demo.career();
	demo.hardwork();
	demo.java();
	demo.job();
	demo.practice();
	demo.sal();*/
		
	AbstractDemoOne demo = new AbstractDemoTwo();
	//demo.career(); this will get error
	demo.hardwork();
	demo.java();
	demo.job();
	demo.practice();
	demo.sal(); 
	
		
	}
}
