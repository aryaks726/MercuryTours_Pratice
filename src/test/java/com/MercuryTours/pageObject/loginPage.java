package com.MercuryTours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class loginPage extends Account {
	public loginPage(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	WebDriver ldriver;
//paths for login
	@FindBy(xpath="//input[@name = 'userName']")
	@CacheLookup
	WebElement txtuserName;
	
	@FindBy(xpath="//input[@name = 'password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name = 'login']")
	@CacheLookup
	WebElement btnLogin;
	//paths to different options
	@FindBy(xpath = "//a[text()='Hotels']")
	WebElement txtHotels;

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement txtRegister;

	@FindBy(xpath = "//a[text()='Flights']")
	WebElement txtFlights;
//methods for above login
	public void setuserName(String uname) {
		txtuserName.sendKeys(uname);
		
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
		
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickHotels()
	{
		txtHotels.click();

	}
	
	public void clickRegister()
	{
		txtRegister.click();
	}
	
	public void clickFlights()
	{
		txtFlights.click();
	}
	
}