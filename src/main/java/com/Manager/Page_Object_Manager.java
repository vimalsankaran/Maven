package com.Manager;

import org.openqa.selenium.WebDriver;

import com.pom.BookingPage;
import com.pom.ConfirmationPage;
import com.pom.ItineraryPage;
import com.pom.Login_Page;
import com.pom.SearchPage;
import com.pom.SelectPage;

public class Page_Object_Manager {

	public WebDriver driver;

	private Login_Page login;
	
	private SearchPage search;
	
	private SelectPage select;
	
	private BookingPage book;
	
	private ConfirmationPage confirm;
	
	private ItineraryPage itinerary;
	

	public Login_Page getLogin() {
		
		if(login==null) {
			
			login = new Login_Page(driver); 
		
		}
		
		return login;
	}


	public SearchPage getSearch() {
		
		if(search==null) {
			
			search = new SearchPage(driver); 
		
		}
		
		return search;
	}


	public SelectPage getSelect() {
		
	    if(select==null) {
			
			select = new SelectPage(driver); 
		
		}
	
		return select;
	}

	
	public BookingPage getBook() {
		
	    if(book==null) {
			
			book = new BookingPage(driver); 
		
		}
	    
		return book;
	}

	public ConfirmationPage getConfirm() {
	    
		if(confirm==null) {
			
			confirm = new ConfirmationPage(driver); 
		
		}
		
		return confirm;
	}


	public ItineraryPage getItinerary() {
	    
		if(itinerary==null) {
			
			itinerary = new ItineraryPage(driver); 
		
		}
		
		return itinerary;
	}


	public Page_Object_Manager(WebDriver driverr) {
		this.driver = driverr;
	}
	
	
}
