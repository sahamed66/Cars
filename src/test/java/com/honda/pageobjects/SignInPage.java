package com.honda.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;	
	}

	@FindBy (xpath="//div[contains(text(),'Log In')]") 	private WebElement loginButton;
	@FindBy (xpath="//input[@aria-label='Email']") 		private WebElement emailAddress;
	@FindBy (xpath="//input[@aria-label='Password']") 	private WebElement password;
	@FindBy (xpath="//button[@data-linkname='log-in-submit']") private WebElement loginSubmit;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginSubmit() {
		return loginSubmit;
	}
	
}
