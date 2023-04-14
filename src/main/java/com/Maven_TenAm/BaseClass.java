package com.Maven_TenAm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	static WebDriver driver; //null
	
	public static WebDriver browser_Launch() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
    driver=new ChromeDriver(); 
    driver.manage().window().maximize();
    return driver;
	}
	
	public static void url(String url) {
    driver.get(url);
	}
	
	public static void pass_Input(WebElement element, String input) {
    element.sendKeys(input);
	}
	
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void dropDown(WebElement element, String method, String value) {
    Select s=new Select(element);
    if (method.equals("value")) {
		s.selectByValue(value);
	}else if (method.equals("text")) {
		s.selectByVisibleText(value);
	}else {
		int i = Integer.parseInt(value);
		s.selectByIndex(i);
	}
	}
	
	public static void refresh() {
    driver.navigate().refresh();
	}
	
	

}
