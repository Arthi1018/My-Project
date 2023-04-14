package com.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Maven_TenAm.BaseClass;

public class Stale extends BaseClass {
	public static WebDriver driver=browser_Launch();
	public static void main(String[] args) {
		url("amazon.in");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Arthi1018");
		refresh();
		user.sendKeys("Arthi1018");
	}

}
