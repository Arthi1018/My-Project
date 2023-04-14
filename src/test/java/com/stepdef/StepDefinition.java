package com.stepdef;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.Maven_TenAm.BaseClass;
import com.pom.PomOfPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	public static WebDriver driver= browser_Launch();
	public static PomOfPom p=new PomOfPom(driver);
	
	@Given("Launch the browser and pass the URL")
	public void launch_the_browser_and_pass_the_url() {
	   url("https://adactinhotelapp.com/");
	}
//	@When("Pass the username in the username field")
//	public void pass_the_username_in_the_username_field() {
//	    pass_Input(p.getL().getUsername(), "Arthiha1018");
//	}
//	@When("Pass the password in the password field")
//	public void pass_the_password_in_the_password_field() {
//	 pass_Input(p.getL().getPassword(), "IA779U");
//	}
	
	@When("Pass {string}  in the username field")
	public void pass_in_the_username_field(String string) {
		 pass_Input(p.getL().getUsername(), string);
	}
	@When("Pass {string} in the password field")
	public void pass_in_the_password_field(String pw) {
	    pass_Input(p.getL().getPassword(), pw);
	}
	
	@When("Click on login button")
	public void click_on_login_button() {
	click(p.getL().getLogin());
	}
	@Then("User should get navigated to the Search hotels page")
	public void user_should_get_navigated_to_the_search_hotels_page() {
	    String title="Adactin.com - Search Hotel";
	   Assert.assertEquals(title, driver.getTitle());
	}

}
