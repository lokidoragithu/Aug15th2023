package com.rameshsoft.automation.seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest {

public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("key", "value");//we have a static method is called set property method.
	System.setProperty("webDriver.chrome.driver", "C:\\Users\\purin\\eclipse-workspace\\javacore\\Drivers\\chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();//on this driver reference we can see findelements with webelement(2),search context(1) (driver.fin)
	WebDriver driver = new ChromeDriver();// here we can see only two findelement with perameters(driver.fin)
	//SearchContext sc = new ChromeDriver();//here we can see find elements two.(sc.)
	//RemoteWebDriver driver = new ChromeDriver();//here we can see 3 find methods,(driver.fin)
	
	//using RemoteWebDriver also 3 approaches we have.
	
   //when we are comment out the chromedriver,then we can run this prgm it will open the browser with minimization. how we can maximize this?
	driver.manage().window().maximize();
   // and i want delet the cookies
	driver.manage().deleteAllCookies();
   // i wnat to enter the url.
	driver.get("https://www.gmail.com");
	
	
	
	//1.identify the web element(username).
	//WebElement userName = driver.findElement(By.name("identifierId"));//(1.is there only one identifier id in the gmail.com page,it will identify the element and comes back to first identified element.  2.in the gmail.com page there is no elements with the idetifier id we will get exception. 3.assume that there are 20 elements are there with id=identifier id  so all the elements are going to be identify but comes back returns the first identify element.. )
	WebElement userName = driver.findElement(By.ByName.name("identifier")); //this is the second approach.
	//2.perform the action
	userName.clear();
	userName.sendKeys("lokikatta@gmail.com");
	
	Thread.sleep(5000);// here we aill get error so on that time we can do cntrl shift the add atomation option.
	
	//1.identify the next webelement
	//WebElement nxt = driver.findElement(By.id("identifierNext"));//this is first approach
	WebElement nxt = driver.findElement(By.ById.id("identifierNext"));//this is second approach
	//2.perform the action
	nxt.click();
	
	Thread.sleep(5000);
	
	// i want to close the browser.
	driver.close();
	
	//once it is open i want to wait for 5 mints,, what i am doing it is to stop our application execution certain of time so we have a predefind class is calles Thread in this class we have n number of methods are there.
	//we have public static void sleep(long ms);
	//public static void sleep(long ms,long mns);
	//when ever we call sleep method it will pass our application certain period of time.
	//like this way prgm..
	/*class Thread
	{
	public static void sleep(long ms);
	public static void sleep(long ms,long mns);
	;;;;;
	}*/
	
	
	
/* 
	  1     2     3      2      3               2     3         2            3          2              3            
<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" aria-label="Email or phone"
   2       3        2       3            4     5
 name="identifier" id="identifierId" > Gmail</input>



1--->tagname
2--->attribute name/property name
3--->attribute value/property value
4--->text of the web element
5--->end of the tag
*/

}
}






