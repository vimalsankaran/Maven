package adactin_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class Configg_Reader {	
public static Properties p;
	
	public  Configg_Reader() throws Throwable {
		File f = new File("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\src\\main\\java\\propertyfile\\Configg.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getCheckin() {
		String checkin = p.getProperty("checkin");
		return checkin;
	}
	public String getCheckout() {
		String checkout = p.getProperty("checkout");
		return checkout;
	}

	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getAddress1() {
		String address1 = p.getProperty("address1");
		return address1;
	}
	public String getAddress2() {
		String address2 = p.getProperty("address2");
		return address2;
	}
	public String getCardno() {
		String cardno = p.getProperty("cardno");
		return cardno;
	}
	public String getCardcvv() {
		String cardcvv = p.getProperty("cardcvv");
		return cardcvv;
	}

}
