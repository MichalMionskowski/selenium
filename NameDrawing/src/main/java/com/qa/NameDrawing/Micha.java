package com.qa.NameDrawing;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Micha {

	@FindBy(xpath = "//*[@id=\"catch\"]")
	private WebElement canvas;
	
	public WebDriver driver = null;
	Actions act ;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		act = new Actions(driver);
	}
	
	
	@Test
	public void drawName()throws InterruptedException,IOException{
		driver.get("https://www.youidraw.com/apps/painter/");
		act.moveByOffset(200, 400).perform();
		act.clickAndHold().moveByOffset(0, -150).release().perform();
		act.clickAndHold().moveByOffset(40, 150).release().perform();
		act.clickAndHold().moveByOffset(40, -150).release().perform();
		act.clickAndHold().moveByOffset(0, 150).release().perform();
		act.moveByOffset(50, 0).perform();
		act.clickAndHold().moveByOffset(0, -150).release().perform();
		act.moveByOffset(50, 150).perform();
		act.clickAndHold().moveByOffset(40, 0).release().perform();
		act.moveByOffset(-40,0).perform();
		act.clickAndHold().moveByOffset(0,-150).release().perform();
		act.clickAndHold().moveByOffset(40, 0).release().perform();
		act.moveByOffset(20,150).perform();
		act.clickAndHold().moveByOffset(0,-150).release().perform();
		act.moveByOffset(0, 75).release().perform();
		act.clickAndHold().moveByOffset(40, 0).release().perform();
		act.moveByOffset(0, -75).release().perform();
		act.clickAndHold().moveByOffset(0, 150).release().perform();
		act.moveByOffset(20,0).release().perform();
		
		act.clickAndHold().moveByOffset(20, -150).release().perform();
		act.clickAndHold().moveByOffset(20, 150).release().perform();
		act.moveByOffset(-10, -75);
		act.clickAndHold().moveByOffset(-20,0 ).release().perform();
		
	}
	
	public void draw() {

		

	}

}
