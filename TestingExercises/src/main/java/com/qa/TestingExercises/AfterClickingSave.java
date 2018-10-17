package com.qa.TestingExercises;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AfterClickingSave {
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	WebElement create_id;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	WebElement create_password;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	WebElement create_submit; 
	
	@FindBy(xpath= "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	WebElement check;
	
	
	public void uname(String username)   {
		create_id.sendKeys(username);
	}
	
	public void pass(String password)   {
		create_password.sendKeys(password);
		create_submit.submit();
	}
	
	
	public String get_id() {
		return check.getText();
	}

	
	public WebElement get_password() {
		return create_password;
	}


}