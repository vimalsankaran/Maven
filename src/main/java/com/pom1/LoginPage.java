package com.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pwd;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public LoginPage(WebDriver driverr) {
        this.driver= driverr;
		PageFactory.initElements(driver, this);	
	}
}
