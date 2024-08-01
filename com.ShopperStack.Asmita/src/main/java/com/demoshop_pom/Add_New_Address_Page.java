package com.demoshop_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_New_Address_Page {
	
	public Add_New_Address_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="Address_FirstName")
	private WebElement FirstNameTF;
	
	@FindBy(id ="Address_LastName")
	private WebElement LastNameTF;
	
	@FindBy(id ="Address_Email")
	private WebElement EmailTF;
	
	@FindBy(id ="Address_Company")
	private WebElement CompanyTF;
	
	@FindBy(id ="Address_CountryId")
	private WebElement CountryIdDropDown;
	
	@FindBy(id ="Address_StateProvinceId")
	private WebElement StateProvinceIdDropDown;
	
	@FindBy(id ="Address_City")
	private WebElement CityTF;
	
	@FindBy(id ="Address_Address1")
	private WebElement Address1TF;
	
	@FindBy(id ="Address_Address2")
	private WebElement Address2TF;
	
	@FindBy(id ="Address_ZipPostalCode")
	private WebElement ZipPostalCodeTF;
	
	@FindBy(id ="Address_PhoneNumber")
	private WebElement PhoneNumberTF;
	
	@FindBy(id ="Address_FaxNumber")
	private WebElement FaxNumberTF;
	
	@FindBy(xpath ="//input[@value='Save']")
	private WebElement LoginBtn;

	public WebElement getFirstNameTF() {
		return FirstNameTF;
	}

	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getCompanyTF() {
		return CompanyTF;
	}

	public WebElement getCountryIdDropDown() {
		return CountryIdDropDown;
	}

	public WebElement getStateProvinceIdDropDown() {
		return StateProvinceIdDropDown;
	}

	public WebElement getCityTF() {
		return CityTF;
	}

	public WebElement getAddress1TF() {
		return Address1TF;
	}

	public WebElement getAddress2TF() {
		return Address2TF;
	}

	public WebElement getZipPostalCodeTF() {
		return ZipPostalCodeTF;
	}

	public WebElement getPhoneNumberTF() {
		return PhoneNumberTF;
	}

	public WebElement getFaxNumberTF() {
		return FaxNumberTF;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	
	
}
