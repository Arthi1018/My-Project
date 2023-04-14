package com.Maven_TenAm;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Login;
import com.pom.PomOfPom;
import com.pom.SearchHotels;
import com.properties.ConfigurationReader;
import com.properties.FileReaderManager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AppTest extends BaseClass{
	public static WebDriver driver=browser_Launch("https://adactinhotelapp.com/");
    
  public static void main(String[] args) throws IOException {
	  PomOfPom p=new PomOfPom(driver);
	
	  File f=new File("C:\\Users\\Arthiha\\Downloads\\Data.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fis);
		
		String value = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
	  
	  pass_Input(p.getL().getUsername(), value);
	  pass_Input(p.getL().getPassword(), FileReaderManager.getInstanceF().getInstanceC().getPassword());
	  click(p.getL().getLogin());
	  dropDown(p.getS().getLocation(), "value", "Sydney");
}
}
