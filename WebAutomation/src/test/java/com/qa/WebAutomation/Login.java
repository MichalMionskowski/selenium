package com.qa.WebAutomation;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	public WebDriver driver = null;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	@Test
	public void createAccount() throws InterruptedException, IOException{
		driver.get("http://thedemosite.co.uk/index.php");
		AddUser a= PageFactory.initElements(driver, AddUser.class);
		a.addButton();
		AccDetails ad= PageFactory.initElements(driver, AccDetails.class);
		ad.addUser("12345","12345");
		LoginClass lc= PageFactory.initElements(driver, LoginClass.class);
		lc.login("12345","12345");
		String retu = lc.getmessage();
		assertEquals("**Successful Login**",retu);
	}
	
	@After
	public void teardown() {
			driver.close();
	}
}
