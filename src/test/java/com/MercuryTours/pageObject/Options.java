package com.MercuryTours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Options extends loginPage {

	public Options(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	//Paths to go to different options
	@FindBy(xpath = "//a[text()='Hotels']")
	WebElement txtHotels;

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement txtRegister;

	@FindBy(xpath = "//a[text()='Flights']")
	WebElement txtFlights;

//Actions for above paths
	public void clickHotels(String hotels)
	{
		txtHotels.click();

	}
	public void clickRegister(String register)
	{
		txtRegister.click();
	}
	public void clickFlights(String flight)
	{
		txtFlights.click();
	}
	
}
