package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement paymenttype;

	public WebElement getPaymenttype() {
		return paymenttype;
	}
	
	public PaymentPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}
	
}
