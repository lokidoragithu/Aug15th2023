package com.ramesh.javacore;

class ConstructorsTest3
{
	int practHrs = 15;
	String res = "JOBS";
	
	public void hello() {
		System.out.println(practHrs+" "+res);
		
	}
}

public class ConstructorsDemo3 extends ConstructorsTest3
{
	int practHrs = 0;
	String res = "NO JOBS";
	
	
	public void hello() { //in this we cant use static context, inside the static methods we cant use this,super keyword,if you can use we will get error.
		int practHrs = 9;
		String res = "JOB";
		System.out.println(practHrs+" "+res);//9 JOB
		System.out.println(this.practHrs+" "+this.res);
		System.out.println(super.practHrs+" "+super.res);
		super.hello();//we will get parent class method
		//this.hello();//we will get exception. bec of this is already hello method so get exception.
	}



public static void main(String[] args)
{
	ConstructorsDemo3 demo = new ConstructorsDemo3();
	demo.hello();
}
}
