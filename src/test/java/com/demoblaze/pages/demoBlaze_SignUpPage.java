package com.demoblaze.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoBlaze_SignUpPage {
	
	WebDriver driver;
	
	By txt_SignUp_UserName=By.id("sign-username");
	By txt_SignUp_UserPassword=By.id("sign-password");
	By btn_SignUp=By.xpath("//button[text()=\"Sign up\"]");
	
	public demoBlaze_SignUpPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void user_SignUp(String userName, String userPwd) throws InterruptedException
	{
		driver.findElement(txt_SignUp_UserName).sendKeys(userName);
		driver.findElement(txt_SignUp_UserPassword).sendKeys(userPwd);
		driver.findElement(btn_SignUp).click();
		Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 String str_AlertMsg=alert.getText(); 		 
	     alert.accept();		
	     assertEquals("Sign up successful.", str_AlertMsg,"Validate User Sign Up finished Successfully & Alert Message Displayed to User");
	}

}
