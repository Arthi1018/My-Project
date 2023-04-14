package com.pojo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Maven_TenAm.BaseClass;
import com.pom.PomOfPom;

public class Parameters_Passing extends BaseClass{
public static WebDriver driver=browser_Launch();
public static PomOfPom p=new PomOfPom(driver);

@DataProvider
private Object[][] datas() {
	return new Object[][]{{"Arthiha1018", "IA779U"},{"Sanjith1018","123456"},
		{"ABC123", "HELLO123"}};
	}

	
	@Test(dataProvider = "datas")
	private void login(String username, String password) {
		url("https://adactinhotelapp.com/");
		pass_Input(p.getL().getUsername(), username);
		pass_Input(p.getL().getPassword(), "IA779U");
		click(p.getL().getLogin());
	}
}
