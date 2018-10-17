package com.qa.TestingExercises;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Login {
	
	public WebDriver driver = null;

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
}
	
	@Test
	public void createuser() {
		driver.get("http://thedemosite.co.uk/addauser.php");
		User U = PageFactory.initElements(driver, User.class);
		U.uname("1234");
		U.pass("1234");
		AfterClickingSave A = PageFactory.initElements(driver, AfterClickingSave.class);
		A.uname("1234");
		A.pass("1234");
		String check=A.get_id();
		assertEquals("**Successful Login**",check);
	}
	
	
	
	@After
	public void tearDown() {
		driver.quit();
}
	
}