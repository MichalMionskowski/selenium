package com.qa.parameterisationExample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPage {

	@FindBy(xpath="//*[@id=\"sb_form_q\"]")
	private WebElement searchBar;
	
	@FindBy(xpath="//*[@id=\"sb_form_go\"]")
	private WebElement searchButton;
	
	
	public void searchFor(String search) {
		searchBar.sendKeys(search);
	}
	
	public void pressSearch() {
		searchButton.click();
	}
	
}
