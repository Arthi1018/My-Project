package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature", glue = "com.stepdef", monochrome = true, tags="@Login", plugin = {"json:Cucumber reports/Cucumber.json"}, publish = true)
public class Runner {
	


}
