package com.honda.testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.honda.pageobjects.Homepage;
import com.honda.utils.commonUtil;

public class carsDropdownTest extends commonUtil{
	WebDriver driver;
//	Homepage home = new Homepage(driver);

	@BeforeSuite
	public void setUp() {
		getConfigProperty();
		
		if(prop.getProperty("browser").contentEquals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");// System property
		driver = new ChromeDriver(); // default constructor of chrome driver class because no parameter here.
		}
		else if(prop.getProperty("browser").contentEquals("FF")) {
			System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");// System property
			driver = new FirefoxDriver(); // default constructor of chrome driver class because no parameter here.
				
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("qaurl"));
		initiatePages(driver);
	}

	@Test
	public void testCarsDropdown() {

		Select CarType = new Select(home.getStockType());
		
		CarType.selectByVisibleText("Used Cars");
		
		Select makeType = new Select(home.getMakeID());
		
		makeType.selectByVisibleText("Honda");
		
		Select ModelType = new Select(home.getModelId());
		
		ModelType.selectByVisibleText("Pilot");
		Select priceType = new Select(home.getPriceMax());
		
		priceType.selectByValue("50000");
		Select DistanceType = new Select(home.getRadius());
		
		DistanceType.selectByValue("100");
		
		home.getZipcode().sendKeys("60008");
		home.getSearchButton().click();
	}

		@AfterSuite
		public void teardown() {
		driver.quit();

	}
}
