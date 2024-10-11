package com.demoblaze.pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoBlaze_ProductDetailsPage {
	
	WebDriver driver;
	
	By lbl_Product_Text=By.xpath("//h2[@class=\"name\"]");
	By lbl_Product_Price=By.xpath("//h3[@class=\"price-container\"]");
	By btn_AddToCart=By.xpath("//a[text()=\"Add to cart\"]");
	
	public demoBlaze_ProductDetailsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public String getstrProductName(){
	
	return driver.findElement(lbl_Product_Text).getText();
	}
	
			 
	public String getProductPrice() {
		String prd_Price=driver.findElement(lbl_Product_Price).getText();
		return prd_Price;
	}
	
	
	public String addProductToCart() throws InterruptedException {
		driver.findElement(btn_AddToCart).click();		
		Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 String str_AlertMsg=alert.getText(); 		 
	     alert.accept();
		return str_AlertMsg ;
	}
}
