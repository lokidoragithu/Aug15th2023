package com.ramesh.javacore;

public class FactorialTest {
public static void main(String[] args) {
	 /*int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);
	  */
	int num =9;
	int fact =1;
	for(int i=num; i>=1; i--)
	{
		fact =fact*i;
	}
	   System.out.println("factorial number is:"+fact);
}
}
