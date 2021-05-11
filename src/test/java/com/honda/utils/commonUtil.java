package com.honda.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.honda.pageobjects.Homepage;
import com.honda.pageobjects.SignInPage;
import com.honda.pageobjects.SignUpPage;

public class commonUtil {

	public Homepage home;
	public SignUpPage signUp;
	public SignInPage signIn;
	WebDriver driver;
	protected Properties prop = new Properties();

	public void initiatePages(WebDriver driver) {

		home = PageFactory.initElements(driver, Homepage.class);
		signUp = PageFactory.initElements(driver, SignUpPage.class);
		signIn = PageFactory.initElements(driver, SignInPage.class);
	}

	public void getConfigProperty() {
		FileReader reader;
		try {
			reader = new FileReader(
					"C:\\My__eclipse-workspace\\SeleniumPractise\\input\\config.properties");
			prop.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@BeforeSuite
	public void setUp() {
		getConfigProperty();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		if(prop.getProperty("browser").contentEquals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");// System property
		driver = new ChromeDriver(capabilities); // default constructor of chrome driver class because no parameter here.
		}
		else if(prop.getProperty("browser").contentEquals("FF")) {
			System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver.exe");// System property
			driver = new FirefoxDriver(capabilities); // default constructor of chrome driver class because no parameter here.
				
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("qaurl"));
		initiatePages(driver);
	}
	
	@AfterSuite
	public void teardown() {
	driver.quit();

}

}
