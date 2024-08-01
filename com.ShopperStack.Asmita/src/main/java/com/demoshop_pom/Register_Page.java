package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

	public Register_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-female")
	
	private WebElement GenderRadioBtn;

	public WebElement getGenderRadioBtn() {
		return GenderRadioBtn;
	}

	@FindBy(id = "FirstName")
	private WebElement FirstNameTF;
	public WebElement getFirstNameTF() {
		return FirstNameTF;
	}

	@FindBy(id = "LastName")
	private WebElement LastNameTF;
	public WebElement getLastNameTF() {
		return LastNameTF;
	}
	
	@FindBy(id = "Email")
	private WebElement EmailTF;

	public WebElement getEmailTF() {
		return EmailTF;
	}
	
	@FindBy(id= "Password")
	private WebElement PasswordTF;

	public WebElement getPasswordTF() {
		return PasswordTF;
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordTF;

	public WebElement getConfirmPasswordTF() {
		return ConfirmPasswordTF;
	}
	
	@FindBy(id ="register-button")
	private WebElement registerbuttonTF;

	public WebElement getRegisterbuttonTF() {
		return registerbuttonTF;
	}
	
	
	
	
	
}
