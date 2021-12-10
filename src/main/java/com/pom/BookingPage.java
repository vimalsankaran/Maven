package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement dropcctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropccmonth;

	@FindBy(id="cc_exp_year")
	private WebElement dropccyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookbtn;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getDropcctype() {
		return dropcctype;
	}

	public WebElement getDropccmonth() {
		return dropccmonth;
	}

	public WebElement getDropccyear() {
		return dropccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return bookbtn;
	}
	
	public BookingPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}
		
}
