package com.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class General14 {
	
	public static WebDriver driver;
	
	
	
	
	public WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--RemoteAcceptOrigin");
		driver=new ChromeDriver(c);			
		return driver;
	}
	
	public void getUrl(String url)
	{
		driver.get(url);
	}
	
	

	
	
}
