package com.rameshsoft.automation.seleniumcore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FramesDemo {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\purin\\eclipse-workspace\\javacore\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		//this below code is for implicit wait sycronization.
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		/*Options options = driver.manage();
		Timeouts timeouts =options.timeouts();
		timeouts.implicitlyWait(45,TimeUnit.SECONDS);*/
		
		
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		//driver.manage().timeouts().setScriptTimeout(5,TimeUnit.MINUTES);
		
		
		driver.get("https://www.jqueryui.com/");
		
		Thread.sleep(9000);
		
		
		driver.findElement(By.linkText("Autocomplete")).click();
		
		 List <WebElement> listFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Noof frames are: "+listFrames.size());
		 
		//driver.switchTo().frame(0);
		 
		/*TargetLocator targetLocator = driver.switchTo();
		targetLocator.frame(0);*/ //this two lines are for WebDriver frame(int index);
		
		//this frame is not having any String id/name so we can skip this one..(WebDriver frame(String id/name);
		
		
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		
		//WebDriverWait wait = new WebDriverWait(driver,46);
		//wait.until(ExpectedCondition.visibilityOf(frameElement));
		
		driver.switchTo().frame(frameElement);
		
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
		ExpectedConditions.attributeContains(By.id("identifierId"), "name", "identifier");
		ExpectedConditions.attributeContains(frameElement, "class", "demo-frame");
		
		driver.findElement(By.id("tags")).sendKeys("java");//this element is from frame we need to move our focus from web page to frame.how do we move that?
		
		//how do we combine this frame to wepage leval?
	    driver.switchTo().defaultContent();
				
		
		driver.findElement(By.linkText("Draggable")).click();//here i am switching to frame but this dragabble element is webpage leval so we can get exception..
	
		//at this stage my selenium is focused on frame or mainwindow?
		//answer)main window.
		
			
		driver.switchTo().frame(0);
		
		WebElement draggable1 = driver.findElement(By.id("dragabble"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(draggable1, 150,150).build().perform();
		
		driver.switchTo().defaultContent();//when ever we call this content request from moved to frame to web page leval..
		
		driver.findElement(By.linkText("Droppable")).click();//my selenium is going to check this is inside the frame or main window level?  answ: frame leval
		driver.switchTo().frame(0);
		
		
		WebElement draggable2 = driver.findElement(By.id("draggable"));
		WebElement droppable2 = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(draggable2,droppable2).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
