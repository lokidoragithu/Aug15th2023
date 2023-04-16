package com.ramesh.javacore;
class ConstructorsTest //when this constructor is going to be executed? when we are generated object on that time it will executed.
{
	int practHrs;// through constructors we can perform initialisation for this two variables.
	String result;// which is the best constructor for initialisation? parameterised is the best one.
	public ConstructorsTest(int practHrs,String result)//this is called parameterised constructor. (This parameters is also called local variables)
	{
		this.practHrs = practHrs;// here 9 is assigning to this practHrs 
		this.result = result; //here job is assigning to this result
	}
	public void hello()    // in this case compiler is going to be generate default construcors or not? no, bec of our class is having one constructor so compiler never generate default constroctor.
	{
		System.out.println(practHrs+ " "+result);
	}
	
//when ever we have class level variables and local variables are same if we are using inside that the prayority always go to the local otherwise if your given to priyority for class level use the keyword is this.		
	
}
public class ConstructorsDemo1 {
public static void main(String[] args) {
	ConstructorsTest test = new ConstructorsTest(9,"JOB");
	test.hello();
}
}
