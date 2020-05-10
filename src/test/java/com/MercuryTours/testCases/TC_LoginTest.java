package com.MercuryTours.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.MercuryTours.pageObject.loginPage;


public class TC_LoginTest extends BaseClass {
	
	

	@Test
	
	public void login() {
		driver.get(baseUrl);
		logger.info("URL is Opened ");
		loginPage lp = new loginPage(driver);
		//for logging 
		
		lp.clickAccount(Account);
		logger.info("Sign up option is clicked ");
		lp.setuserName(userName);
		logger.info("Entered Username ");
		lp.setPassword(Password);
		logger.info("Entered Password ");
		lp.clickSubmit();
		logger.info("Clicked on login button");
		// After logging in and playing with various buttons
		
		
		lp.clickHotels();
		logger.info(" Suessfully logged in and clicked Hotels option");
		lp.clickRegister();
		logger.info("Clicked Hotels option");
		lp.clickFlights();
		logger.info("Clicked Flights option");
	}
	
}
	