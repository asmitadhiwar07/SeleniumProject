package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Address {

	public MyAccount_Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() ='Addresses']")
	private WebElement AddressesBtn;

	public WebElement getAddressesBtn() {
		return AddressesBtn;
	}
	
	
}
