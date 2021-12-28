package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Add'])[1]")
	private WebElement add1;
	
	@FindBy(xpath="(//a[@title='Add'])[2]")
	private WebElement add2;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed;

	public WebElement getAdd1() {
		return add1;
	}

	public WebElement getAdd2() {
		return add2;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public SummaryPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}
	
}
