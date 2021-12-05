package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Base.Base_Class;

public class Runner_Class extends Base_Class {
public static void main(String[] args) throws Throwable {
    openwebapp("chrome", "http://automationpractice.com/index.php");	
    gettitle();
    WebElement login = driver.findElement(By.className("login"));
    clickk(login);
    WebElement signup = driver.findElement(By.id("email_create"));
    input(signup, "psvimal@gmail.com");
    WebElement createbtn = driver.findElement(By.id("SubmitCreate"));
    clickk(createbtn);
    sleep(4000);
    WebElement gender = driver.findElement(By.id("id_gender1"));
    clickk(gender);
    WebElement radio1 = driver.findElement(By.name("id_gender"));
    selected(radio1);
    WebElement firstname = driver.findElement(By.id("customer_firstname"));
    input(firstname, "Vimal");
    WebElement lastname = driver.findElement(By.id("customer_lastname"));
    input(lastname, "Sankaran");
    WebElement password = driver.findElement(By.id("passwd"));
    input(password, "Vimal2356");
    WebElement day = driver.findElement(By.id("days"));
    dropDown(day, "byindex", "14");
    WebElement month = driver.findElement(By.id("months"));
    dropDown(month, "bytext", "December ");
    WebElement year = driver.findElement(By.id("years"));
    dropDown(year, "byvalue", "1990");
    WebElement check1 = driver.findElement(By.id("newsletter"));
    Checkbox(check1);
    WebElement check2 = driver.findElement(By.id("optin"));
    Checkbox(check2);
    WebElement company =driver.findElement(By.id("company"));
    input(company, "Greens Technologies");
    WebElement address1 = driver.findElement(By.id("address1"));
    input(address1, "No.6, Leisure Lane");
    WebElement address2 = driver.findElement(By.id("address2"));
    input(address2, "Boulder St");
    WebElement city = driver.findElement(By.id("city"));
    input(city, "Los Angeles");
    WebElement state = driver.findElement(By.id("id_state"));
    dropDown(state, "bytext", "California");
    WebElement postcode = driver.findElement(By.id("postcode"));
    input(postcode, "91303");
    WebElement landmark = driver.findElement(By.id("other"));
    input(landmark, "LandMark: Near KFC");
    WebElement mobile = driver.findElement(By.id("phone_mobile"));
    input(mobile, "9876543210");
    WebElement alias = driver.findElement(By.id("alias"));
    alias.clear();
    input(alias, "Home");
    System.out.println("Given Personal Information:");
    System.out.println();
    System.out.println("First Name: ");
    getAttributevalue(firstname, "value");
    System.out.println();
    System.out.println("Last Name: ");
    getAttributevalue(lastname, "value");
    System.out.println();
    System.out.println("Company: ");
    getAttributevalue(company, "value");
    System.out.println();
    System.out.println("Address: ");
    getAttributevalue(address1, "value");
    getAttributevalue(address2, "value");
    getAttributevalue(city, "value");
    getfirstoption(state);
    System.out.println("ZIP Code:");
    getAttributevalue(postcode, "value");
    System.out.println();
    System.out.println("Additional Information: ");
    getAttributevalue(landmark, "value");
    System.out.println();
    System.out.println("Mobile: ");
    getAttributevalue(mobile, "value");
    System.out.println();
    System.out.println("Address Reference Name:  ");
    getAttributevalue(alias, "value");
    WebElement registerbtn = driver.findElement(By.id("submitAccount"));
    clickk(registerbtn);
    sleep(4000);
    takescreenshot("C:\\Users\\Vimal\\eclipse-workspace\\Dec_Mini_Project\\screenshot\\mini1.png");
    sleep(2500);
    close();

}
}
