package com.honda.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	WebDriver driver;

	public SignUpPage(WebDriver driver) {		//parameterized constructor ???
		this.driver = driver;				//Initiate the driver object
	}
	
	@FindBy(xpath = "//input[@type='text' or @aria-label='Email']")
	private WebElement email_Txtbox;
	
	@FindBy(xpath="//input[@type='password' and @aria-label='Password' ]")
	private WebElement password_Txtbox;
	
	@FindBy(xpath="//input[@type='password' and @aria-label='Confirm Password' ]")
	private WebElement confPassword_Txtbox;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement signUp_Button;
	
	@FindBy(xpath="//li[@data-linkname='login-tab']")
	private WebElement LogIN_Tab;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail_Txtbox() {
		return email_Txtbox;
	}

	public WebElement getPassword_Txtbox() {
		return password_Txtbox;
	}

	public WebElement getConfPassword_Txtbox() {
		return confPassword_Txtbox;
	}

	public WebElement getSignUp_Button() {
		return signUp_Button;
	}

	public WebElement getLogIN_Tab() {
		return LogIN_Tab;
	}
	

}
