package com.qa.WebAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClass {

	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement unametxt;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement passtxt;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement loginButton;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement message;
	
	public void login(String uname, String pass) {
		unametxt.sendKeys(uname);
		passtxt.sendKeys(pass);
		loginButton.click();
	}
	
	public String getmessage() {
		return message.getText();
	}
}
