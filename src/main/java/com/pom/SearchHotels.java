package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels {
	private WebDriver driver;
	
public SearchHotels(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

@FindBy(id = "location")
private WebElement location;


public WebElement getLocation() {
	return location;
}
}
