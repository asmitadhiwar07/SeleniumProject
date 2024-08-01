package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Main_Page {
	public Login_Main_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement EmailTF;
	public WebElement getEmailTF() {
		return EmailTF;
	}
	
	@FindBy(id = "Password")
	private WebElement PasswordTF;
	public WebElement getPasswordTF() {
		return PasswordTF;
	}
	
	@FindBy(xpath = "//input[contains(@value ,'Log in')]")
	private WebElement Loginbtn;
	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	
	
}
