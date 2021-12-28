package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	
	public WebDriver driver;
	
	@FindBy(name="cgv")
	private WebElement checkbox;
	
	@FindBy(name="processCarrier")
    private WebElement proceed;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public ShippingPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}
}
