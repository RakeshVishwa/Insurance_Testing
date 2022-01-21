package com.TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CommonFunction.CommonFunction;
import com.PageObject.RQuationPageobject;
import com.TestData.RequestQuationTestData;

public class TC_RequestQuation_002 extends BaseClass {
	
	
	@Test
	public static void RequestQuation()
	{
		RQuationPageobject Rq= new RQuationPageobject(driver);
		
		CommonFunction.click(Rq.RequestQuotation);
		
		 try 
		 { 
			 Thread.sleep(5000);
			 } 
		 catch (Exception e) 
		 { 
			 // TODO: handle exception 
		 }
		 
			
			  CommonFunction.click(Rq.CBreakdown);
			 
			  CommonFunction.click(Rq.SBreakdown);
			
			  CommonFunction.click(Rq.YWindrepair);
			 
			  CommonFunction.enterText(Rq.Incident, RequestQuationTestData.getincidents());
			  
			  CommonFunction.enterText(Rq.Registration,
			  RequestQuationTestData.getregistration());
			  
			  CommonFunction.enterText(Rq.Mileage, RequestQuationTestData.getmiealge());
			  
			  CommonFunction.enterText(Rq.Value, RequestQuationTestData.getvalue());
			  
			  CommonFunction.click(Rq.CPaking);
			  
			  CommonFunction.click(Rq.SParking);
			  
			  CommonFunction.click(Rq.CYear);
			  
			  CommonFunction.click(Rq.SYear);
			  
			  CommonFunction.click(Rq.CMonths);
			  
			  CommonFunction.click(Rq.SMonths);
			  
			  CommonFunction.click(Rq.CDate);
			  
			  CommonFunction.click(Rq.SDate);
			  
			  CommonFunction.click(Rq.CPrieum);
			  
			  System.out.println("Calculated Premium is -");
			  
			 // CommonFunction.gettext(Rq.Calculatedpremium);
			  
			  
			  CommonFunction.click(Rq.SQuation); 
			 
		
	}

}
