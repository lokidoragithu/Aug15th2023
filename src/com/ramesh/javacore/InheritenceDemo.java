package com.ramesh.javacore;

class FpMen
{
	public static void login() {
		System.out.println("fpMen:login()");
	}
	public static void clothes() {
		System.out.println("fpMen:clothes()");
	}
	public static void logout() {
		System.out.println("fpMen:logout()");
	}
	
}

class FpWomen extends FpMen       // this is called inheritence 
{
	/*private void login() {           // we are using login and logout methos are repetedly we dont use duplicate code so we need to remove those ones.
		System.out.println("login()");    so these repeted once are reuse it .how to re use those once?  we can use extends from which class you want it we can select it.
	}*/
	public static void goldjewellery() {
		System.out.println("FpWomen:goldjewellery()");
	}
	/*private void logout() {
		System.out.println("logout()");
	}*/
	
	
}

class FpKids extends FpWomen
{
	/*private void login() {
		System.out.println("login()");
	}*/
	public static void toys() {
		System.out.println("FpKids:toys()");
	}
	/*private void logout() {
		System.out.println("logout()");
	}*/

	
	
}


public class InheritenceDemo {
	public static void main(String[] args) {
		//1.creating parent class object
		/*FpMen fpMen = new FpMen();
		fpMen.login();
		fpMen.clothes();
		fpMen.logout();*/
		
		//2.creating child class object
		/*FpWomen fpWomen = new FpWomen();
		FpWomen.login();
		FpWomen.clothes();
		FpWomen.goldjewellery();
		FpWomen.logout();*/
		
		/*FpKids fpKids = new FpKids();
		FpKids.login();
		FpKids.clothes();
		FpKids.goldjewellery();
		FpKids.toys();
		FpKids.logout();*/
		
		//3. creating child class object by using parent class reference
		/*FpMen fpMen = new FpWomen();
		FpMen.login();
		FpMen.clothes();
		FpMen.logout();*/
		//FpMen.goldjewellery(); in this case child class all blocks (instance blocks and static blocks and also construction blocks not going to be executed)
		
		//4.creating parent class object by using child class reference.
		//FpWomen fpWomen = new FpMen();
		
	}

}
