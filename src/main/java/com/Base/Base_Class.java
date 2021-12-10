package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Base_Class {

	public static WebDriver driver;
	public static WebDriver browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void clickk(WebElement element) {
		element.click();
	}
	public static void input(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	public static void timeout(int waittime) {
		driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void getAttributevalue(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	public static void gettext(WebElement element) {
		String attribute = element.getText();
		System.out.println(attribute);
	}
	public static void gettitle() {
		String pagetitle = driver.getTitle();
		System.out.println("Page title is " + pagetitle);		
	}
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is  " + currentUrl );
	}
	public static void mousehover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();  	
	} 
	public static void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).contextClick(element).build().perform();
	}
	public static void leftclick (WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	public static void doubleClick(WebElement element) {
		   Actions a = new Actions(driver);
		   a.doubleClick(element).build().perform();
    }
	public static void performDrag(WebElement source,WebElement target) {
		   Actions a = new Actions(driver);
		   a.dragAndDrop(source,target).build().perform();
    }
	public static void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	public static void confirmAlert(String action) {
		if(action.equalsIgnoreCase("accept") ) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		else if(action.equalsIgnoreCase("dismiss") ) {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
	}
	public static void promptAlert(String action, String value) {
		if(action.equalsIgnoreCase("accept") ) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(value);
			alert.accept();
		}
		else if(action.equalsIgnoreCase("dismiss") ) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(value);
			alert.dismiss();
		}

	}
	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void keydown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
	public static void keyup() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);	
	}
	public static void keyenter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
	}
	
	public static void manageWindow() {
		   driver.getWindowHandle();
	}
	public static void manageWindows() {
		   driver.getWindowHandles();
	}
	public static void switchtoWindow(int index) {
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtab.get(index));
	}
	
	public static void dropDown(WebElement element,String type,String value) {
		
		Select s=new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
				}
		else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
			 }
		else if (type.equalsIgnoreCase("bytext")) {
			
			s.selectByVisibleText(value);
			 }
	}
	
	public static void multipledropdown(Select name,int a,int b ,int c) {
		 List<WebElement> alloptions = name.getOptions();
		 int size = alloptions.size();
			for (int i = 0; i <=size; i++) {
				if (i==a||i==b||i==c) {
					name.selectByIndex(i);					}		
			}
	}
	
	public static void Checkbox(WebElement element) {
		element.click();
	}
    public static void selected(WebElement element) {
		   element.isSelected();
	}
	   
	public static void enabled(WebElement element) {
		   element.isEnabled();
	}
	public static void elementVisible(WebElement element) {
		   element.isDisplayed();
	}
	public static void getfirstoption(WebElement element) {
		Select s = new Select(element);
  	    WebElement firstSelectedOption = s.getFirstSelectedOption();
  	    String text = firstSelectedOption.getText();
  	    System.out.println(text);
	}
	public static void getalloptions(WebElement element) {
		Select s1= new Select(element);
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
	    for (WebElement alloptions: allSelectedOptions) {
		String text = alloptions.getText();
		System.out.println(text);
		}
	}
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}

	
	public static void takescreenshot (String location) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File f = t.getScreenshotAs(OutputType.FILE);
		File f1 = new File(location);
		FileHandler.copy(f, f1);
	} 
	
	
	
}
