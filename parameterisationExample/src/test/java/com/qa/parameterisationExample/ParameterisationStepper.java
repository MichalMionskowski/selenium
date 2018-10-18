package com.qa.parameterisationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.*;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterisationStepper {
	public WebDriver driver = null;
	String searchedT = "";
	static ExtentReports extent = new ExtentReports(Constants.reportAdd,true);
	ExtentTest test = extent.startTest("Testing Bing search");
	
	
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) throws Throwable {
		test.log(LogStatus.INFO, "searching for the website");
		System.setProperty(Constants.webDriver, Constants.drivePath);
		driver = new ChromeDriver();
		driver.get(arg1);
	    
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		test.log(LogStatus.INFO, "inserting the saerch term");
		this.searchedT = arg1;
		WebPage searchTerm = PageFactory.initElements(driver,WebPage.class);
		searchTerm.searchFor(arg1);
		searchTerm.pressSearch();
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
		SearchedTerm searched = PageFactory.initElements(driver, SearchedTerm.class);
		String a = searched.isRight();

		if(this.searchedT.equals(a)) {
			test.log(LogStatus.PASS, "Search was successful");
		}else {
			test.log(LogStatus.FAIL, "Search fail");
		}
		extent.flush();
		assertEquals(this.searchedT,a );
		
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}
