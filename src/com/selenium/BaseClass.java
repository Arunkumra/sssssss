package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;

	public static void getdriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prem kumar\\eclipse-workspace\\sathish\\SeleniumProject\\driver\\chromedriver.exe" );
         driver=new ChromeDriver();
         }
	public static void loadurl(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e,String valve) {
		e.sendKeys(valve);
	}
	public static void button(WebElement e) {
		e.click();

	}

	

	}


