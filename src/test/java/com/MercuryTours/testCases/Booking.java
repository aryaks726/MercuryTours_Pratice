package com.MercuryTours.testCases;

import org.testng.annotations.Test;

import com.MercuryTours.pageObject.Options;

public class Booking extends TC_LoginTest{
	@Test
	public void book() {
		driver.get(Flights);
		logger.info("URL is Opened ");
		Options op = new Options(driver);
		//Playing with different options before login
		op.clickHotels(Hotels);
		logger.info("Clicked Hotels option");
		op.clickRegister(Register);
		logger.info("Clicked Register option");
		op.clickFlights(Flights);
		logger.info("Clicked Flights option");
	}
}
