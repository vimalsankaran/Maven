package com.Runner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.Base.Base_Class;
import com.Manager.Page_Object_Manager1;
import automation_reader.File_Reader_Manager;

public class Automation_Runner extends Base_Class{
	
	static Logger log = Logger.getLogger(Automation_Runner.class);
	
	public static WebDriver driver = browser("chrome");
	
	public static Page_Object_Manager1 pom = new Page_Object_Manager1(driver);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
    
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
		geturl(url);
		
		getcurrenturl();
		
		sleep(4000);
		
		log.info("Navigated to HomePage");
		//HomePage
		clickk(pom.getHome().getLogin());
		
		sleep(3000);
		
		log.info("Navigated to LoginPage");
		//LoginPage
		
		String username = particulardata("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\Test1.xlsx", 2, 0, 0);
		
		String password = particulardata("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\Test1.xlsx", 2, 1, 0);
		
		input(pom.getLogin().getEmail(), username);
		
		input(pom.getLogin().getPwd(), password);
		
		clickk(pom.getLogin().getSubmit());
		
		sleep(3000);
		
		log.info("Navigated to CategoryPage");
		//CategoryPage
		
		mousehover(pom.getCategory().getWomen());
		
		clickk(pom.getCategory().getSummer());
		
		sleep(4000);
		
		
		log.info("Navigated to ProductPage");
		//ProductPage
		
		timeout(10);
		
		scroll(pom.getProduct().getProductimg1());
		
		mousehover(pom.getProduct().getProductimg1());
		
		mousehover(pom.getProduct().getProduct1());
		
		clickk(pom.getProduct().getProduct1());
		
		scroll(pom.getProduct().getContinue1());
		
		clickk(pom.getProduct().getContinue1());
		
		sleep(3000);
		
		timeout(10);
		
		scroll(pom.getProduct().getProductimg2());
		
		mousehover(pom.getProduct().getProductimg2());
		
		mousehover(pom.getProduct().getProduct2());
		
		clickk(pom.getProduct().getProduct2());
		
		sleep(2000);
		
		clickk(pom.getProduct().getProceed());
		
		sleep(4000);
		
		log.info("Navigated to SummaryPage");
		//SummaryPage
		
		scroll(pom.getSummary().getAdd1());
		
		for(int i=1;i<=3;i++) {
			clickk(pom.getSummary().getAdd1());
		}
		
		scroll(pom.getSummary().getAdd1());
		
		for(int i=1;i<=4;i++) {
			clickk(pom.getSummary().getAdd2());
		}
		
		scroll(pom.getSummary().getProceed());
		
		clickk(pom.getSummary().getProceed());
		
		sleep(4000);
		
		log.info("Navigated to AddressPage");
		//AddressPage
		
		ashot("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\screenshot\\auto1.png");
		
		scroll(pom.getAddress().getMsg());
		
		String msg = File_Reader_Manager.getInstanceFRM().getInstanceCR().getmsg();
		
		input(pom.getAddress().getMsg(), msg);
		
		scroll(pom.getAddress().getProceed());
		
		clickk(pom.getAddress().getProceed());
		
		sleep(4000);
		
		log.info("Navigated to ShippingPage");
		//ShippingPage
		
		scroll(pom.getShipping().getCheckbox());
		
		clickk(pom.getShipping().getCheckbox());
		
		clickk(pom.getShipping().getProceed());
		
		sleep(4000);
		
		log.info("Navigated to PaymentPage");
		
		//PaymentPage
		
		ashot("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\screenshot\\auto2.png");
		
		scroll(pom.getPayment().getPaymenttype());
		
		clickk(pom.getPayment().getPaymenttype());
		
		sleep(4000);
		
		log.info("Navigated to OrderPage");
		//OrderPage
		
		scroll(pom.getOrder().getSubmit());
		
		clickk(pom.getOrder().getSubmit());
		
		sleep(4000);
		
		ashot("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\screenshot\\auto3.png");
		
}
}
