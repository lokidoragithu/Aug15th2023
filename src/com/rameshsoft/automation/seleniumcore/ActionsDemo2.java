//mouse over demo

package com.rameshsoft.automation.seleniumcore;

import javax.sound.sampled.Line;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\purin\\eclipse-workspace\\javacore\\Drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.get("https://www.amazon.in/");
	WebElement prime = driver.findElement(By.xpath("//a[@id=\"nav-link-amazonprime\"]"));
	
	
	Actions actions = new Actions(driver);
	actions.moveToElement(prime).build().perform();
    
	
	Thread.sleep(4000);
	
	driver.get("www.google.com");
	driver.findElement(By.name("q")).sendKeys("lokikatta");
	
	actions.sendKeys(Keys.ENTER).build().perform();
	WebElement rameshsoft = driver.findElement(By.xpath("//h3[contains(text(),'RAMESHSOFT - India')]"));
	
	actions.contextClick(rameshsoft).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
	
    driver.close();
    
    
}
}
