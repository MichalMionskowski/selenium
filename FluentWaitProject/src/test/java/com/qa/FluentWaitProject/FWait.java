package com.qa.FluentWaitProject;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class FWait {

	
	public WebDriver driver = null;
	static ExtentReports  extent = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\Polska\\WebAutomation\\automaaion.html",true);	
	ExtentTest test;
	
	@Before	
	public void setup() {

		System.setProperty(Constants.driver,Constants.path);
		driver = new ChromeDriver();
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
	}
	
	@Test
	public void runFluent() {
		FluentPage wp = PageFactory.initElements(driver, FluentPage.class);
	
		WebElement a = wp.getElement(driver);
		assertEquals("-The Shafeeq", a.getText());
		
	}
	
	@After
	public void finalize() {
		driver.close();
	}
	
	
}
