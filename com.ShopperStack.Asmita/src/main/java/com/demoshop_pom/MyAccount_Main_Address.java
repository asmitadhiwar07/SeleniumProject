package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Main_Address {

	public MyAccount_Main_Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//input[@value='Add new']")
	private WebElement AddAddessNewBtn;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement DeleteBtn;

	public WebElement getAddAddessNewBtn() {
		return AddAddessNewBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
	
	
	
}
