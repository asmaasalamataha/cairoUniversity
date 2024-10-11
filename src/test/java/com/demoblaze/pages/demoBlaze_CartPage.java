package com.demoblaze.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoBlaze_CartPage {
	
	WebDriver driver;
	
	By lbl_ProductsHeader=By.xpath("//h2[text()=\"Products\"]");
	By lbl_ProductName=By.xpath("//td[2]");
	By lbl_ProductPrice=By.xpath("//td[3]");	
	By btn_placeOrder=By.xpath("//button[text()='Place Order']");
	By txt_NameOfOrder=By.id("name");
	By txt_CreditCardNum=By.id("card");
	By btn_PurchaseOrder=By.xpath("//button[text()='Purchase']");
	By lbl_ThankYouForPurchase=By.xpath("//h2[text()='Thank you for your purchase!']");
	By lbl_OrderSummary=By.xpath("//h2[text()='Thank you for your purchase!']/following-sibling::p");
	By btn_ConfirmPurchase=By.xpath("//button[text()=\"OK\"]");
	public demoBlaze_CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	/*public void checkProductDetailsInCart(String prod_Name, String prod_Price) {
		String act_Prod_Name=driver.findElement(lbl_ProductName).getText();
		String act_Prod_Price=driver.findElement(lbl_ProductPrice).getText();
		assertEquals(act_Prod_Name, prod_Name,"Verify Product Name is Matching successfully");		
		assertEquals(prod_Price.contains(act_Prod_Price), true,"Verify Product price is Matching successfully");
	}
	*/
	
	public String checkProductNameInCart() {
        String act_Prod_Name=driver.findElement(lbl_ProductName).getText();
        return act_Prod_Name;
        
    }
    
    
    public String checkProductPriceInCart() {
        
        String act_Prod_Price=driver.findElement(lbl_ProductPrice).getText();
        return act_Prod_Price;
    }
	public void clickPlaceOrder() throws InterruptedException {
		driver.findElement(btn_placeOrder).click();
		Thread.sleep(1000);
	}
	public void fillPlaceOrderToSubmit() throws InterruptedException {		
		driver.findElement(txt_NameOfOrder).sendKeys("testOrder");
		driver.findElement(txt_CreditCardNum).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(btn_PurchaseOrder).click();
		Thread.sleep(1000);
		System.out.println("Order Summary : \n " + driver.findElement(lbl_OrderSummary).getText());
		driver.findElement(btn_ConfirmPurchase).click();
	}

}
