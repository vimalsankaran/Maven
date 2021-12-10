package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {

	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio1;
	
	@FindBy(id="continue")
	private WebElement continue1;

	public WebElement getRadio1() {
		return radio1;
	}

	public WebElement getContinue1() {
		return continue1;
	}
	
	public SelectPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}
	
}
