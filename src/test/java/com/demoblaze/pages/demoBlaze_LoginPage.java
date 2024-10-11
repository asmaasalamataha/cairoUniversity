package com.demoblaze.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoBlaze_LoginPage<WelcomeText> {
	
	WebDriver driver;
	
	By txt_LoginUserName=By.id("loginusername");
	By txt_LoginUserPassword=By.id("loginpassword");
	By btn_LogIn=By.xpath("//button[text()=\"Log in\"]");
	By lbl_WelcomeText=By.id("nameofuser");
	
	public demoBlaze_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void user_Login(String userName, String userPwd) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(txt_LoginUserName).sendKeys(userName);
		driver.findElement(txt_LoginUserPassword).sendKeys(userPwd);
		driver.findElement(btn_LogIn).click();
		Thread.sleep(2000);
		// String str_WelcomeText=driver.findElement(lbl_WelcomeText).getText();
		// assertEquals("Welcome "+userName, str_WelcomeText,"Validate User Logged In Successfully & Welcome text displayed to user:");
	     
	}

	public String getWelcomeText() {
		
		return driver.findElement(lbl_WelcomeText).getText();
		
	}

}
