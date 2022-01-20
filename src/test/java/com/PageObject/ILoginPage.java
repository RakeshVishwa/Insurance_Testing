package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ILoginPage {
	
	WebDriver lLdriver;
	
	public ILoginPage(WebDriver rdriver)
	{
		lLdriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	public @FindBy(name="email") WebElement txtUserName;
	
	public @FindBy(name="password") WebElement txtUserPassword;
	
	public @FindBy(name="submit") WebElement LSubmit;
	

}
