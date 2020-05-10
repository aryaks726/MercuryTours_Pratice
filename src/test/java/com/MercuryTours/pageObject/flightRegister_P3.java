package com.MercuryTours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flightRegister_P3 extends flightRegister_P2{

	public flightRegister_P3(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = " //input[@name='passFirst0']")
	WebElement pFname;
	@FindBy(xpath = "//input[@name='passLast0']")
	WebElement pLname;
	@FindBy(xpath = "//select[@name='pass.0.meal']//option[contains(text(),'Hindu')]")
	WebElement Meal ;
	@FindBy(xpath ="//select[@name='creditCard']//option[contains(text(),'Visa')]")
	WebElement CType ;

	@FindBy(xpath ="//input[@name='creditnumber']")
	WebElement CNumber;


	@FindBy(xpath ="//select[@name='cc_exp_dt_mn']//option[contains(text(),'03')]")
	WebElement EMonth ;

	@FindBy(xpath ="//select[@name='cc_exp_dt_yr']//option[contains(text(),'2007')]")
	WebElement EYear;

	@FindBy(xpath ="//input[@name='cc_frst_name']")
	WebElement FName ;

	@FindBy(xpath ="//input[@name='cc_mid_name']")
	WebElement MName;

	@FindBy(xpath =" //input[@name='cc_last_name']")
	WebElement LName;

	@FindBy(xpath ="//input[@name='billAddress2']")
	WebElement Address;

	@FindBy(xpath ="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")
	WebElement CopyAddress;

	@FindBy(xpath ="//input[@name='delAddress2']")
	WebElement AddressSecond;

	@FindBy(xpath ="//input[@name='buyFlights']")
	WebElement Secure ;

	public void pFirstName(String pfname) {
		pFname.sendKeys(pfname);
	}
	public void pLastName(String plname) {
		pLname.sendKeys(plname);
	}
	public void Meal() {
		Meal.click();;
	}
	public void Card() {
		CType.click();
	}

	public void Number(String number) {
		CNumber.sendKeys(number);
	}
	public void TMonth() {
		EMonth.click();
	}
	public void TYear() {
		EYear.click();
	}
	public void FirstName(String fname) {
		FName.sendKeys(fname);
	}
	public void MiddleName(String mname) {
		MName.sendKeys(mname);
	}
	public void LastName(String lname) {
		LName.sendKeys(lname);
	}
	public void Add(String add) {
		Address.sendKeys(add);
	}

	public void CopyAdd() {
		CopyAddress.click();
	}
	public void AddSecond(String addsecond) {
		AddressSecond.sendKeys(addsecond);
	}

	public void Finish() {
		Secure.click();
	}
}
