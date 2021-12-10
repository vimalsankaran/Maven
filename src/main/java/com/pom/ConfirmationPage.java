package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	public WebDriver driver;
	
	@FindBy(id="hotel_name")
	private WebElement hotelname;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="arrival_date")
	private WebElement datein;
	
	@FindBy(id="departure_text")
	private WebElement dateout;
	
	@FindBy(id="total_rooms")
	private WebElement totalrooms;
	
	@FindBy(id="adults_room")
	private WebElement adults;
	
	@FindBy(id="children_room")
	private WebElement children;
	
	@FindBy(id="price_night")
	private WebElement ppnight;
	
	@FindBy(id="total_price")
	private WebElement total;
	
	@FindBy(id="gst")
	private WebElement gst;
	
	@FindBy(id="final_price")
	private WebElement finalbill;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement billaddress;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getTotalrooms() {
		return totalrooms;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getPpnight() {
		return ppnight;
	}

	public WebElement getTotal() {
		return total;
	}

	public WebElement getGst() {
		return gst;
	}

	public WebElement getFinalbill() {
		return finalbill;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	
	public ConfirmationPage(WebDriver driverr) {
		this.driver=driverr;
		PageFactory.initElements(driver, this);
	}
}
