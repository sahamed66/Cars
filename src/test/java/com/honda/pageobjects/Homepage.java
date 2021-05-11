package com.honda.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {		//parameterized constructor ???
		this.driver = driver;				//Initiate the driver object
	}
	
	@FindBy(name="stockType") 
	private WebElement stockType;
	
	@FindBy(name="makeId") 
	private WebElement makeID;
	
	@FindBy(name="modelId") 
	private WebElement modelId;
	
	@FindBy(name="priceMax") 
	private WebElement priceMax;
	
	@FindBy(name="radius") 
	private WebElement radius;
	
	@FindBy(name="zip") 
	private WebElement zipcode;
	
	@FindBy(xpath="//input[@value='Search']") 
	private WebElement searchButton;
	
	private WebElement carsLogo;
	
	@FindBy(xpath="//a[@data-linkname='header-sign-up']") 
	private WebElement signUpButton;
	
	public WebElement getStockType() {
		return stockType;
	}

	public WebElement getMakeID() {
		return makeID;
	}

	public WebElement getModelId() {
		return modelId;
	}

	public WebElement getPriceMax() {
		return priceMax;
	}

	public WebElement getRadius() {
		return radius;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCarsLogo() {
		return carsLogo;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

}
