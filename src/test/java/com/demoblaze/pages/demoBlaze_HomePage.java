package com.demoblaze.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoBlaze_HomePage {
	
	WebDriver driver;
	
	By lnk_SignUP=By.xpath("//a[text()=\"Sign up\"]");
	By lnk_LogIn=By.xpath("//a[text()=\"Log in\"]");
	By lnk_Cart=By.xpath("//a[text()=\"Cart\"]");
	By lnk_Home=By.xpath("//a[text()=\"Home\"]");
	By lnk_LogOut=By.xpath("//a[text()=\"Log out\"]");
	
	

	public demoBlaze_HomePage(WebDriver driver) {
		this.driver=driver;
	}	
	
	public String getPageTitle() {
		//assertEquals(driver.getTitle(), "STORE");
		return driver.getTitle();
	}
	public void navigateToSignUpPage() {
		driver.findElement(lnk_SignUP).click();
		
	}
	public void navigateToLoginPage() {
		driver.findElement(lnk_LogIn).click();
		
	}
	public void navigateToCartPage() {
		driver.findElement(lnk_Cart).click();
		
	}
	public void navigateToHomePage() {
		driver.findElement(lnk_Home).click();		
	}
	public void userLogout() {
		driver.findElement(lnk_LogOut).click();		
	}
	
	public void selectProduct(String str_ProductName) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='"+str_ProductName+"']")).click();
		Thread.sleep(2000);
	}

}
