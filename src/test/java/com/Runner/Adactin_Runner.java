package com.Runner;

import org.openqa.selenium.WebDriver;

import com.Base.Base_Class;
import com.Manager.Page_Object_Manager;

public class Adactin_Runner extends Base_Class{
	
	public static WebDriver driver = browser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
	    geturl("https://adactinhotelapp.com");
				
		getcurrenturl();
		
		sleep(4000);
		
		//login page
		input(pom.getLogin().getUsername(), "psvimalbe");
		
		input(pom.getLogin().getPassword(), "Vimal2590");
		
		clickk(pom.getLogin().getLogin_Btn());
		
		sleep(3000);
		
		//searchpage
		dropDown(pom.getSearch().getLoc(), "byindex", "2");
		
		dropDown(pom.getSearch().getHotel(), "byindex", "2");
		
		dropDown(pom.getSearch().getRoomtype(), "byindex", "3");
		
		dropDown(pom.getSearch().getRoomnos(), "byindex", "3");
		
		clear(pom.getSearch().getDatein());
		
		input(pom.getSearch().getDatein(), "12/12/2021");
		
		clear(pom.getSearch().getDateout());
		
		input(pom.getSearch().getDateout(), "14/12/2021");
		
		dropDown(pom.getSearch().getAdult(), "byindex", "4");
		
		dropDown(pom.getSearch().getChild(), "byindex", "2");
		
		clickk(pom.getSearch().getSubmit());
		
		sleep(4000);
		
		//SelectPage
		timeout(10);
		
		clickk(pom.getSelect().getRadio1());
		
		clickk(pom.getSelect().getContinue1());
		
		sleep(2000);
		
		//BookingPage
		
		timeout(10);
		
		input(pom.getBook().getFname(), "Vimal");
		
		input(pom.getBook().getLname(), "Sankaran");
		
		input(pom.getBook().getAddress(), "No.320, Shirley Street,");
		
		keyenter();
		
		input(pom.getBook().getAddress(), "Melbourne VIC 3000,");
		
		keyenter();
		
		input(pom.getBook().getAddress(), "Australia");
		
		input(pom.getBook().getCcnum(), "4225858514581458");
		
		dropDown(pom.getBook().getDropcctype(), "byindex", "2");
		
		dropDown(pom.getBook().getDropccmonth(), "byindex", "11");
		
		dropDown(pom.getBook().getDropccyear(), "byvalue", "2022");
		
		input(pom.getBook().getCvv(), "465");
		
		clickk(pom.getBook().getBook());
		
		sleep(4000);
		
		//ConfirmationPage
		timeout(10);
		
		System.out.println("Booking Details:");
		
		System.out.println("Hotel Name:");
		
		getAttributevalue(pom.getConfirm().getHotelname(), "value");
		
		System.out.println();
		
		System.out.println("Location:");
		
		getAttributevalue(pom.getConfirm().getLocation(), "value");
		
		System.out.println();
		
		System.out.println("Room Type:");
		
		getAttributevalue(pom.getConfirm().getRoomtype(), "value");
		
		System.out.println();
		
		System.out.println("Checkin Date:");
		
		getAttributevalue(pom.getConfirm().getDatein(), "value");
		
		System.out.println();
		
		System.out.println("Checkout Date:");
		
		getAttributevalue(pom.getConfirm().getDateout(), "value");
		
		System.out.println();
		
		System.out.println("Total Number of Rooms:");
		
		getAttributevalue(pom.getConfirm().getTotalrooms(), "value");
		
		System.out.println();
		
		System.out.println("Number of Adults:");
		
		getAttributevalue(pom.getConfirm().getAdults(), "value");
		
		System.out.println();
		
		System.out.println("Number of Children:");
		
		getAttributevalue(pom.getConfirm().getChildren(), "value");
		
		System.out.println();
		
		System.out.println("Price Per Night:");
		
		getAttributevalue(pom.getConfirm().getPpnight(), "value");
		
		System.out.println();
		
		System.out.println("Total Price:");
		
		getAttributevalue(pom.getConfirm().getTotal(), "value");
		
		System.out.println();
		
		System.out.println("GST:");
		
		getAttributevalue(pom.getConfirm().getGst(), "value");
		
		System.out.println();
		
		System.out.println("Final Billed Value: ");
		
		getAttributevalue(pom.getConfirm().getFinalbill(), "value");
		
		System.out.println();
		
		System.out.println("Booking Name:");
		
		getAttributevalue(pom.getConfirm().getFirstname(), "value");
		
		System.out.println();
		
		System.out.println("Address:");
		
		getAttributevalue(pom.getConfirm().getBilladdress(), "value");
		
		System.out.println();
		
		System.out.println("Order Number:");
		
		getAttributevalue(pom.getConfirm().getOrderno(), "value");
		
		System.out.println();
		
		clickk(pom.getConfirm().getMy_itinerary());
		
		sleep(4000);
		
		//Itinerary Page
		
		takescreenshot("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\screenshot\\adactin.png");
	
		clickk(pom.getItinerary().getLogout());
		
		close();
	}

}
