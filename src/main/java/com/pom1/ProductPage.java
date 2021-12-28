package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@id='color_20']")
	private WebElement productimg1;
	
	@FindBy(xpath="//a[@data-id-product='5']")
	private WebElement product1;
	
	@FindBy(xpath="//a[@id='color_37']")
	private WebElement productimg2;

	@FindBy(xpath="//a[@data-id-product='7']")
	private WebElement product2;
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement continue1;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public WebElement getProduct1() {
		return product1;
	}

	public WebElement getProduct2() {
		return product2;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public WebElement getProductimg1() {
		return productimg1;
	}

	public WebElement getProductimg2() {
		return productimg2;
	}
	
	public ProductPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}

}
