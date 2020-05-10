package com.MercuryTours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flightRegister_P2 extends flightRegister
{

	public flightRegister_P2(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	WebElement Depart;
	
	@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
	WebElement Return;
	
	@FindBy(xpath ="//input[@name='reserveFlights']")
	WebElement Cont;
	
	public void Go() {
		Depart.click();
	}
	public void Come() {
		Return.click();
	}
	public void Next2() {
		Cont.click();
	}

}
