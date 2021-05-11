package com.honda.testcases;

import org.testng.annotations.Test;

import com.honda.utils.commonUtil;

public class SignUp extends commonUtil{
	
	@Test
	public void  testSignUp() throws InterruptedException {

		home.getSignUpButton().click();
		Thread.sleep(3000);
		
		signUp.getEmail_Txtbox().sendKeys("sahamed66@gmail.com");
		
		signUp.getPassword_Txtbox().sendKeys("Digonto#1");
		
		signUp.getConfPassword_Txtbox().sendKeys("Digonto#1");
		
		signUp.getSignUp_Button().click();
		
		
	
	
	}

}
