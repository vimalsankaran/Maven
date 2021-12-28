package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[@title='Summer Dresses']")
	private WebElement summer;

	public WebElement getWomen() {
		return women;
	}

	public WebElement getSummer() {
		return summer;
	}
	
	public CategoryPage(WebDriver driverr) {
		
		this.driver= driverr;
		
		PageFactory.initElements(driver, this);	
		
		}

}
