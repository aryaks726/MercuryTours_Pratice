package com.MercuryTours.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseUrl= "http://newtours.demoaut.com/mercurywelcome.php";
	public String userName="AryaKS";
	public String Password = "pS17SDF5@14st%147d";
	public String Account = "http://newtours.demoaut.com/mercurysignon.php";
	public String Hotels = "http://newtours.demoaut.com/mercuryunderconst.php";
	public String Register = "http://newtours.demoaut.com/mercuryregister.php";
	public String Flights = "http://newtours.demoaut.com/mercuryreservation.php";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup(){
		logger  = Logger.getLogger("MercuryTours");
		PropertyConfigurator.configure("Log4j.properties");//logger configured
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void teardown() {
		/* driver.quit(); */
	}
	
}

		
	
