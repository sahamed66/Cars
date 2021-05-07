package com.honda.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.honda.pageobjects.Homepage;
import com.honda.pageobjects.SignUpPage;



public class commonUtil {
	
	public Homepage home;
	public SignUpPage signUp;
	WebDriver driver;
	 protected Properties prop=new Properties(); 
	 public void initiatePages(WebDriver driver) {
		
			
			home =PageFactory.initElements(driver, Homepage.class);
			signUp = PageFactory.initElements(driver, SignUpPage.class);
	}
	
	public void getConfigProperty() {
		 FileReader reader;
		try {
			reader = new FileReader("C:\\My__eclipse-workspace\\03_09_2021_Java_Selenium\\src\\test\\resources\\input\\config.properties");
			prop.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	      
		     
	}

}
