package com.MercuryTours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flightRegister extends loginPage {

	public flightRegister(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@name= 'tripType' and @value = 'oneway']")
	WebElement rdType;
	@FindBy(xpath = "//input[@name= 'tripType' and @value = 'roundtrip']")
	WebElement rdsType;
	
	@FindBy(xpath = "//select[@name='passCount']//option[contains(text(),'1')]")
	WebElement dropSelect;
	
	@FindBy(xpath = "//select[@name='fromPort']//option[contains(text(),'New York')]")
	WebElement Newyork ;
	
	@FindBy(xpath = "//select[@name='fromMonth']//option[contains(text(),'July')]")
	WebElement July;
	
	@FindBy(xpath = "//select[@name='fromDay']//option[19]")
	WebElement Nineteen;
	
	@FindBy(xpath = "//select[@name='toPort']//option[contains(text(),'Paris')]")
	WebElement Paris;
	
	@FindBy(xpath = " //select[@name='toMonth']//option[contains(text(),'September')]")
	WebElement September;
	
	@FindBy(xpath = "//select[@name='toDay']//option[contains(text(),'6')]")
	WebElement Six;
	
	@FindBy(xpath = "//input[@name= 'servClass' and @value = 'Business']")
	WebElement Business ;
	
	@FindBy(xpath = "//select[@name='airline']//option[contains(text(),'Pangea Airlines')]")
	WebElement Pangea;
	
	@FindBy(xpath = "//input[@name='findFlights']")
	WebElement Continue;
	
	public void clickOneway()
	{
		rdType.click();
	}
	public void clickRoundTrip()
	{
		rdsType.click();
	}
	
	public void clickFirst()
	{
		dropSelect.click();
		
	}
	
	public void Departing()
	{
		Newyork.click();
		
	}
	 
	public void Month()
	{
		July.click();
		
	}
	
	public void Day()
	{
		Nineteen.click();
		
	}
	public void Arrive()
	{
		Paris.click();
		
	}
	public void rMonth()
	{
		September.click();
		
	}
	public void rDay()
	{
		Six.click();
		
	}
	public void Service()
	{
		Business.click();
	
	}
	public void Airline()
	{
		Pangea.click();
		
	}
	public void Next()
	{
		Continue.click();
		
	}
	
	

}
