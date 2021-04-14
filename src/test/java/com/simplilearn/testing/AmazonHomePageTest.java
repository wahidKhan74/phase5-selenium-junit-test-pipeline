package com.simplilearn.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

class AmazonHomePageTest {

	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "driver/geckodriver";
	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", driverPath);
		// set headless firefox browser
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		driver = new FirefoxDriver(options);
		driver.get(siteURL);
	}

	@AfterEach
	void tearDown() throws Exception {
		// 7. close browser window
		driver.close();
	}

	@Test
	void testAmazonHomePageTitle() {
		// 6. perform test evaluation
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		assertEquals(expectedTitle, driver.getTitle());
	}
	
	@Test
	void testAmazonHomePageSourceURL() {
		// 6. perform test evaluation
		assertEquals(siteURL, driver.getCurrentUrl());
	}

}
