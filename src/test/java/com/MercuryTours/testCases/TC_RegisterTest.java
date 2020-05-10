package com.MercuryTours.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.MercuryTours.pageObject.flightRegister;
import com.MercuryTours.pageObject.flightRegister_P2;
import com.MercuryTours.pageObject.flightRegister_P3;
import com.MercuryTours.pageObject.flightRegister_P4;
import com.MercuryTours.pageObject.loginPage;

public class TC_RegisterTest extends BaseClass {
	@Test

	public void Register() {
		logger.info("URL is Opened ");
		driver.get(Flights);
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
		//for flight register
		flightRegister fr = new flightRegister(driver);
		logger.info("opened fight resigter page 1");
		fr.clickOneway();
		logger.info("Choosed one way flight option");
		fr.clickRoundTrip();
		logger.info("Choosed round trip flight option");
		fr.clickFirst();
		logger.info("Choosed No of Passengers");
		fr.Departing();
		logger.info("Choosed Departure Location");
		fr.Month();
		logger.info("Chossed month of departure");
		fr.Day();
		logger.info("Choosed day of departure");
		fr.Arrive();
		logger.info("Choosed the desinatation locaion");
		fr.rMonth();
		logger.info("Choosed month of return");
		fr.rDay();
		logger.info("Choosed day of return");
		fr.Service();
		logger.info("Chosed which class i want to seat");
		fr.Airline();
		logger.info("Choosed the airlines ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fr.Next();
		logger.info("Clicked on Continue");


		//for flight register page 2
		flightRegister_P2 frs = new flightRegister_P2(driver);
		logger.info("Went to second page");
		frs.Go();
		logger.info("Choosed specific time flight for departure");
		frs.Come();
		logger.info("Choosed specific time flight for return");
		frs.Next2();
		logger.info("Clicked on Continue of second page");

		//for flight register page 3
		flightRegister_P3 frt = new flightRegister_P3(driver);
		logger.info("Went to last page");
		frt.pFirstName("Arya");
		logger.info("Entered FirstName");
		frt.pLastName("KS");
		logger.info("Entered Lastname");
		frt.Meal();
		logger.info("Clossed Meal option");
		frt.Card();
		logger.info("Choosed card type for payment");
		frt.Number("123456789");
		logger.info("Entered Contact Number");
		frt.TMonth();
		logger.info("Entered expiry month");
		frt.TYear();
		logger.info("Entered expiry year");
		frt.FirstName("Arya");
		logger.info("Enter account holders first name");
		frt.MiddleName("");
		logger.info("Middle name left blank");
		frt.LastName("KS");
		logger.info("Enterd account holders last name");
		frt.Add("Kathmandu");
		logger.info("Entered billing address ");
		frt.CopyAdd();
		logger.info("Ticked on copy address");
		frt.AddSecond("Bhaktapur");
		logger.info("Entered delivery address");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frt.Finish();
		logger.info("clicked on secure purchase");

		flightRegister_P4 frf = new flightRegister_P4(driver);
		frf.BTF();
		logger.info("Back to flight register page clicked");
		
		//below are other options
		/*
		frf.BTH();
		logger.info("Back to home page page clicked");
		frf.logout();
		logger.info("Logged out"); 
		*/
	}
}
