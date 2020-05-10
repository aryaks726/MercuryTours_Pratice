package com.MercuryTours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flightRegister_P4 extends flightRegister_P3{

	public flightRegister_P4(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[1]/a/img")
	WebElement backtoFlights;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img")
	WebElement backtoHome;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")
	WebElement Logout;
	
	public void BTF()
	{
		backtoFlights.click();
		
	}
	public void BTH() {
		backtoHome.click();
	}
	public void logout() {
		Logout.click();
	}
}
