package com.ramesh.javacore;



abstract class ReadOnlyTest
{
	static int practHrs = 9;
	static String result = "JOB";
	
	static public void hello() {
		System.out.println(practHrs+ " "+result);
	}
}
public class ReadOnlyDemo {
	public static void main(String[] args) {
		//ReadOnlyTest test = new ReadOnlyTest();  // through this object we can change the behaviour .
		/*test.practHrs = 0;
		test.result = "NO JOB";
		test.hello();
		
		System.out.println(test.practHrs);
		System.out.println(test.result);
		
		test.hello();*/
		ReadOnlyTest.hello();
		
		

	}

}


