package com.qa.NameDrawing;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawName {
	public WebDriver driver = null;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void drawName()throws InterruptedException,IOException{
		driver.get("https://www.youidraw.com/apps/painter/");
	}
}
