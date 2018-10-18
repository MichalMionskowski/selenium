package com.qa.parameterisationExample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchedTerm {
	
	@FindBy(xpath="//*[@id=\"sb_form_q\"]")
	private WebElement searchBar;
	
	public String isRight() {
		String searched = searchBar.getAttribute("value");
		return searched;
	}
}
