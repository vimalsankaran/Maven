package com.Manager;

import org.openqa.selenium.WebDriver;
import com.pom1.AddressPage;
import com.pom1.CategoryPage;
import com.pom1.HomePage;
import com.pom1.LoginPage;
import com.pom1.OrderConfirmationPage;
import com.pom1.OrderPage;
import com.pom1.PaymentPage;
import com.pom1.ProductPage;
import com.pom1.ShippingPage;
import com.pom1.SummaryPage;

public class Page_Object_Manager1 {

	public WebDriver driver;
	
	private AddressPage address;
	
	private CategoryPage category;
	
	private HomePage home;
	
	private LoginPage login;
	
	private OrderConfirmationPage orderconfirm;
	
	private OrderPage order;
	
	private PaymentPage payment;
	
	private ProductPage product;
	
	private ShippingPage shipping;
	
	private SummaryPage summary;

	public AddressPage getAddress() {
		
		if(address==null) {
			
			address = new AddressPage(driver);
			
		}
		return address;
	}

	public CategoryPage getCategory() {
		
		if(category==null) {
			
			category = new CategoryPage(driver);
			
		}
		return category;
	}
	
	public LoginPage getLogin() {
		
		if(login==null) {
			
			login = new LoginPage(driver);
			
		}
		return login;
	}

	public HomePage getHome() {
		
		if(home==null) {
			
			home = new HomePage(driver);
			
		}
		return home;
	}

	public OrderConfirmationPage getOrderconfirm() {
		
		if(orderconfirm==null) {
			
			orderconfirm = new OrderConfirmationPage(driver);
			
		}
		return orderconfirm;
	}

	public OrderPage getOrder() {
		
		if(order==null) {
			
			order = new OrderPage(driver);
			
		}
		return order;
	}

	public PaymentPage getPayment() {
		
		if(payment==null) {
			
			payment = new PaymentPage(driver);
			
		}
		return payment;
	}

	public ProductPage getProduct() {
		
		if(product==null) {
			
			product = new ProductPage(driver);
			
		}
		return product;
	}

	public ShippingPage getShipping() {
		
		if(shipping==null) {
			
			shipping = new ShippingPage(driver);
			
		}
		return shipping;
	}

	public SummaryPage getSummary() {
		
		if(summary==null) {
			
			summary = new SummaryPage(driver);
			
		}
		return summary;
	}
	
	public Page_Object_Manager1(WebDriver driverr) {
		this.driver = driverr;
	}
	
}
