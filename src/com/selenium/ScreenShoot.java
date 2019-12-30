package com.selenium;




import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\prem kumar\\eclipse-workspace\\sathish\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot tk=(TakesScreenshot)driver;
		File screenshot =tk.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\prem kumar\\eclipse-workspace\\sathish\\SeleniumProject\\new");
		
		
	
		
	}

 
	}

		