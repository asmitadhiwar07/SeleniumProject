package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text() = 'Register']")
	
	private WebElement RegisterBtn;

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}
	
	
	

}
