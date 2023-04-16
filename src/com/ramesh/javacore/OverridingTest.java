package com.ramesh.javacore;

class Parent  //final class parent we can not write final in class level because of we can not extend the final class if in case we are trying to extend we will get compile time error.
{
	
    int practHrs = 9;  //here we can declare variable as a final we cant change the behaviour of that final method.
    static public void study() {         //this is called method hiding because of parent and child class methos both in static type. this type of mechanism is called method hiding.
		System.out.println("PC: study()");
	}
	public void job() {
		System.out.println("PC: job()");
	}
	public void friends() {
		System.out.println("PC: friends()");
	}
	public Object money() { //when ever we declare the method as final we cant override that final method if we are trying to override that final method we will get error.
		practHrs = 12;
		System.out.println("PC: money()");
		return practHrs;
	}
	
}

class Child extends Parent
{
	
	public Object money() {
		System.out.println("CC: I WANT MORE MONEY()");
		return "Do practice";
	}
	
	static public void study() {          //this is called method hiding
		System.out.println("CC: I don't study()");
	}
	@Override
	final public void friends() {
		System.out.println("CC: HI friends()");
	}
	//@Override   //if we are mentioned override here we will get error here bec of in my parent class we dont have bussiness method 
	public void business() {
		System.out.println("CC:Business()");
	}
	
}
public class OverridingTest {
	public static void main(String[] args) {
		/*Parent parent = new Parent();
		parent.study();
		parent.friends();
		parent.job();
		parent.money();*/
		
		/*Child child = new Child();
		child.study();
		child.friends();
		child.job();
		child.money();
		child.business();*/
		
		Parent parent = new Child();
		parent.study();  //this is method hiding bec of study class is both parent and child classes static thats why this is method hiding..
		parent.friends();
		parent.job();
		parent.money();
	}

}
