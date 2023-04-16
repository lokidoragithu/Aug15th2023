package com.rameshsoft.automation.seleniumcore;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\purin\\eclipse-workspace\\javacore\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bing.com");
		Thread.sleep(5000);
		WebElement image = driver.findElement(By.linkText("Images"));//here we need to give i was capital letter only bec of in the bing.com inspct option having <a> thage on that we are having the element is Images.
		image.click();
		Thread.sleep(5000);
		driver.close();
	}
}
