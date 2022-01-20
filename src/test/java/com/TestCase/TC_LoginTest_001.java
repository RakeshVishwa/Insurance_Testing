package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		//Added Validation for login 
		if(driver.getTitle().equals("Insurance Broker System"))
		{
			Assert.assertTrue(true);
			//boolean flag= true;
			
			System.out.println("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			//boolean flag= false;
			
			System.out.println("Test Case Passed");
		}
	}

}
