package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.CommonFunction.CommonFunction;
import com.PageObject.ILoginPage;
import com.TestData.LoginTestData;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", LoginTestData.getChrompath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(LoginTestData.getApplicationurl());
		
		
        ILoginPage lp=new ILoginPage(driver);
		
		CommonFunction.enterText(lp.txtUserName, LoginTestData.getApplicationUsername());
		
		CommonFunction.enterText(lp.txtUserPassword, LoginTestData.getApplicationPassword());
		
		CommonFunction.click(lp.LSubmit);

}
	//After Method
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
}   
