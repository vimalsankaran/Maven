package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	public WebDriver driver;
	
	@FindBy(name="message")
	private WebElement msg;
	
	@FindBy(name="processAddress")
	private WebElement proceed;

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public AddressPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}
	
}
