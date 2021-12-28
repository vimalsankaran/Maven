package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {

	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='price']")
	private WebElement scroll;

	public WebElement getScroll() {
		return scroll;
	}
	
	public OrderConfirmationPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}
}
