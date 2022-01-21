package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RQuationPageobject {
	
	WebDriver RqLdriver;
	
	public RQuationPageobject(WebDriver bdriver)
	{
		RqLdriver=bdriver;
		PageFactory.initElements(bdriver, this);
		
	}
	
	public @FindBy(linkText="Request Quotation") WebElement RequestQuotation;
	
	
	 public @FindBy(id="quotation_breakdowncover") WebElement CBreakdown;
	 
	 public @FindBy(xpath="//*[@id=\"quotation_breakdowncover\"]/option[2]")
	  WebElement SBreakdown;
	 
	 public @FindBy(id="quotation_windscreenrepair_t") WebElement YWindrepair;
	 
	  public @FindBy(name="incidents") WebElement Incident;
	  
	  public @FindBy(name="registration") WebElement Registration;
	  
	  public @FindBy(name="mileage") WebElement Mileage;
	  
	  public @FindBy(name="value") WebElement Value;
	  
	  public @FindBy(name="parkinglocation") WebElement CPaking;
	  
	  public @FindBy(xpath="//*[@id=\"quotation_vehicle_attributes_parkinglocation\"]/option[5]")
	  WebElement SParking;
	  
	  public @FindBy(name="year") WebElement CYear;
	  
	  public @FindBy(xpath="//*[@id=\"quotation_vehicle_attributes_policystart_1i\"]/option[2]")
	  WebElement SYear;
	  
	  public @FindBy(name ="month") WebElement CMonths;
	  
	  public @FindBy(xpath ="//*[@id=\"quotation_vehicle_attributes_policystart_2i\"]/option[4]")
	  WebElement SMonths;
	  
	  public @FindBy(name ="date") WebElement CDate;
	  
	  public @FindBy(xpath ="//*[@id=\"quotation_vehicle_attributes_policystart_3i\"]/option[15]")
	  WebElement SDate;
	  
	  public @FindBy(xpath="//*[@id=\"new_quotation\"]/div[8]/input[1]") WebElement CPrieum;
	  
	 // public @FindBy(id="calculatedpremium") WebElement Calculatedpremium;
	  
	 // public @FindBy(xpath="//*[@id=\"calculatedpremium\"]/text()[2]") WebElement Calculatedpremium;
	  
	  public @FindBy(xpath="//*[@id=\"new_quotation\"]/div[8]/input[3]") WebElement SQuation; 
	 
	
	

}
