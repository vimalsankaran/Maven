package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy(id ="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="login")
	private WebElement login_Btn;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}
	
	public Login_Page(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}
	
}
