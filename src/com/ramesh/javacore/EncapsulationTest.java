package com.ramesh.javacore;
class EncapsulationDemo     //this class is tightly encapsulation class because of class should be private method can be any type. 
{
    public int practHrs = 9;  //private is tightly encapsulation
    public String name ="Practice"; //private is tightly encapsulation
    
    public int getpractHrs() {
    	return practHrs;
    }
    
    public String getName() {
    	return name;
    }
    
    
    public void hello() {
		System.out.println(practHrs + " " + name);

	}

}
public class EncapsulationTest {
public static void main(String[] args) {
	
	EncapsulationDemo demo = new EncapsulationDemo();//object creation bec of this class is non static 
	
	//demo.practHrs = 0;//this value replace by 9
	//demo.name = "No job";//this value replace by practice //here output is o,no job,0 no job
	
	
	int practHrsResp = demo.getpractHrs();
	System.out.println(practHrsResp);
	
	String nameResp = demo.getName();
	System.out.println(nameResp);
	
	demo.hello(); //output is 9,practHrs,9practHrs
	
		
	}
}
