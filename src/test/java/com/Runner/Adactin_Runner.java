package com.Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Base.Base_Class;
import com.Manager.Page_Object_Manager;
import adactin_Reader.File_Reader_Manager1;

public class Adactin_Runner extends Base_Class{
	
	static Logger log = Logger.getLogger(Adactin_Runner.class);
	
	public static WebDriver driver = browser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getUrl();
		
	    geturl(url);
				
		getcurrenturl();
		
		sleep(4000);
		
		//login page
		log.info("Navigated to Login Page");
		String username = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getUsername();
		String password = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getPassword();
		
		input(pom.getLogin().getUsername(), username);
		
		input(pom.getLogin().getPassword(), password);
		
		clickk(pom.getLogin().getLogin_Btn());
		
		sleep(3000);
		
		//searchpage
		log.info("Navigated to Search Page");
		dropDown(pom.getSearch().getLoc(), "byindex", "2");
		
		dropDown(pom.getSearch().getHotel(), "byindex", "2");
		
		dropDown(pom.getSearch().getRoomtype(), "byindex", "3");
		
		dropDown(pom.getSearch().getRoomnos(), "byindex", "3");
		
		clear(pom.getSearch().getDatein());
		
		String checkin = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getCheckin();
		String checkout = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getCheckout();
		
		input(pom.getSearch().getDatein(), checkin);
		
		clear(pom.getSearch().getDateout());
		
		input(pom.getSearch().getDateout(), checkout);
		
		dropDown(pom.getSearch().getAdult(), "byindex", "4");
		
		dropDown(pom.getSearch().getChild(), "byindex", "2");
		
		clickk(pom.getSearch().getSubmit());
		
		sleep(4000);
		
		//SelectPage
		log.info("Navigated to Search Page");
		timeout(10);
		
		clickk(pom.getSelect().getRadio1());
		
		clickk(pom.getSelect().getContinue1());
		
		sleep(2000);
		
		//BookingPage
		log.info("Navigated to Booking Page");
		
		timeout(10);
		
		String firstname = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getFirstname();
		String lastname = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getLastname();
		String address = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getAddress();
		String address1 = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getAddress1();
		String address2 = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getAddress2();
		String cardno = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getCardno();
		String cvv = File_Reader_Manager1.getInstanceFRM().getInstanceCR().getCardcvv();
		
		input(pom.getBook().getFname(), firstname);
		
		input(pom.getBook().getLname(), lastname);
		
		input(pom.getBook().getAddress(), address);
		
		keyenter();
		
		input(pom.getBook().getAddress(), address1);
		
		keyenter();
		
		input(pom.getBook().getAddress(), address2);
		
		input(pom.getBook().getCcnum(), cardno);
		
		dropDown(pom.getBook().getDropcctype(), "byindex", "2");
		
		dropDown(pom.getBook().getDropccmonth(), "byindex", "11");
		
		dropDown(pom.getBook().getDropccyear(), "byvalue", "2022");
		
		input(pom.getBook().getCvv(), cvv);
		
		clickk(pom.getBook().getBook());
		
		sleep(4000);
		
		//ConfirmationPage
		log.info("Navigated to Confirmation Page");
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
		log.info("Navigated to Itinerary Page");
		
		takescreenshot("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\screenshot\\adactin.png");
	
		clickk(pom.getItinerary().getLogout());
		
		close();
	}

}
