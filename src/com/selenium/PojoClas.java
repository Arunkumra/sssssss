package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClas extends BaseClass {
	public PojoClas()
	{
PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbutton;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
