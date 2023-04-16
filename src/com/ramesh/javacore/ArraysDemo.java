package com.ramesh.javacore;

public class ArraysDemo {
public static void main(String[] args) {
	String[] str = new String[9];//this is an string array it will take only string values otherthan will get error.
	str[0] = "java";
	//str[1] = 456;//it cant be hold non string it can hold only string values..
	str[1] = "selenium";
	str[2] = "do practice";
	str[3] = "job";
	str[8] = "hardwork";
	//str[9] = "if u dont do practice";//this array having 8 indexes but we are alloted 9th index we are going to get exception.. the first problem is arrays are homogenious  means the same type of elements.
	//the second problem is the size is fixed.
	
	for (int i = 0; i<str.length; i++)
		{
		      System.out.println(str[i]);
		}
	
	
	//int[] i1 = new int[6];//this is an integer array this will accepted only integer values only, arrays are homogeninious. means it can hold same type of elements.

//arrays are hold only same type of values. if we dont have same values we will not get those values..

     int[] i = {456,345,5678,987,232};
     
     
     String[] str1 = {"job","do","practice","work"};
     
     for(int i1=0; i1<str1.length; i1++)
     {
    	 System.out.println(str1[i1]);
     }


}
}
