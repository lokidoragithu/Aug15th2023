package com.ramesh.javacore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	//List list = new List();//this is not possible bec of we cant create object for interface
	//List list = new ArrayList<>();//it is valid
    //Collection collection = new ArrayList<>();//valid
    ArrayList al = new ArrayList();//this means one arraylist object is going to be created with size 10.
    al.add(456);
    al.add("java");
    al.add('a');
    al.add(456);
    al.add(null);
    al.add(456);
    al.add(456);
    al.add("job");
    System.out.println(al);
}
}
