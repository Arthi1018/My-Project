package com.pom;

import org.openqa.selenium.WebDriver;

public class PomOfPom {
	
	public WebDriver driver;
	
	private SearchHotels s;
	
	private Login l;
	
	public PomOfPom(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login getL() {
		l=new Login(driver);
		return l;
	}

	public SearchHotels getS() {
		s=new SearchHotels(driver);
		return s;
	}


}
