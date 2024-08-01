package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[ text() = 'Log in']")
	private WebElement LoginBtn;

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
}
