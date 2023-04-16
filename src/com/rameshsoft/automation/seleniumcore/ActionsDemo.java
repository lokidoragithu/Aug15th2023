package com.rameshsoft.automation.seleniumcore;

import javax.sound.sampled.Line;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\purin\\eclipse-workspace\\javacore\\Drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.get("https://www.gmail.com");
	//driver.navigate().to("https://www.gmail.com");
	//driver.navigate().to(new URL("https://www.gmail.com"));	
	//in the above line we are using javascriptExecutor
	
	WebElement un = driver.findElement(By.id("identifierId"));
	//un.clear();
	un.sendKeys("lokikatta");
	
    Actions actions = new Actions(driver);
    //actions.sendKeys(un, "lokikatta").build().perform();
    //actions.click(un).sendKeys("lokikatta").build().perform();
     //actions.click(un).sendKeys("lokikatta").perform();
    // if incae we dont mentioned build method internally this perform method is going to be perform build method. like above line 
    //why we should call build method and perform method?
   // when ever we call build method we can actions on single Line.class.
    //when we call perform method we can perform the actions we can call in perform()..
    // using javascriptExecutor while using this action we can do datatyping actions.
    // using Robot class while using this action also we can do datatyping actions.
    
    
    
    /*Actions actions2 = actions.click(un);
    Actions actions3 = actions2.sendKeys("lokikatta");
    Action action = actions3.build();
    action.perform();*/  //this is the way the same as above line 31
    
    
    //how do we perform clicable actions?
    //WebElement nxt = driver.findElement(By.id("identifierId"));
    WebElement nxt = driver.findElement(By.id("identifierNext"));
    //nxt.click();
    //nxt.submit();//when ever in the webElement is having type= submit,attribute that time only we cant use nxt.submit() otherwise we cant use this mehod..
    //actions.click(nxt).build().perform();
    //actions.doubleClick(nxt).build().perform();
    actions.sendKeys(nxt, Keys.ENTER).build().perform();
    //how can you use arrows in this fuctions like left arrow down arrown...
   actions.sendKeys(Keys.END).perform();
    
   actions.sendKeys(Keys.HOME).build().perform();
   
   actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
   
   actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_RIGHT).build().perform();
   
   //how to refresh the page?
   actions.sendKeys(Keys.F5).build().perform();
   
   //ctrl+s
   //ctrl+t
   actions.sendKeys(Keys.CONTROL,"s").build().perform();
   actions.sendKeys(Keys.CONTROL,"t").build().perform();
   
  actions.sendKeys(Keys.chord(Keys.CONTROL),"s").build().perform();
  actions.sendKeys(Keys.chord(Keys.CONTROL),"t").build().perform();
  
  
//ctrl+shift+ s
//ctrl+shift+ t
  
  
  
  actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"s").build().perform();
  actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"t").build().perform();
  
  actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT).build().perform();//or like in the down line
  actions.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_LEFT).build().perform();
  
  actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).build().perform();
  actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_UP).build().perform();
  
  
  
  
  
  
  
  
  
  
  
  
   
   
   
   
   
   
   
    
    Thread.sleep(4000);
    driver.close();
    
    
}
}
