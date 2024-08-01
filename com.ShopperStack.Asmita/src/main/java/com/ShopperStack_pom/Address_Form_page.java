package com.ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Form_page {
	   public Address_Form_page(WebDriver driver) {
	     PageFactory.initElements(driver , this);
	   }
	   
	   @FindBy(id ="addAddress")
	   private WebElement addAddressBtn;
	   
	   @FindBy(id="Office")
	   private WebElement officeTf;
	   
	   @FindBy(id="Name")
	   private WebElement nameTf;
	   
	   @FindBy(xpath = "//input[contains(@id,'House/Office Info')]")
	   private WebElement houseoffice;
	   
	   @FindBy(xpath = "//input[contains(@id,'Street Info')]")
	   private WebElement streetInfo;
	   
	   @FindBy(id="Landmark")
	   private WebElement landmarkTf;
	   
	   @FindBy(id="Country")
	   private WebElement countryDd;
	   
	   @FindBy(id="State")
	   private WebElement stateDd;
	   
	   @FindBy(id="City")
	   private WebElement cityDd;
	   
	   public WebElement getAddAddressBtn() {
	  return addAddressBtn;
	   }

	   public WebElement getOfficeTf() {
	  return officeTf;
	   }

	   public WebElement getNameTf() {
	  return nameTf;
	   }

	   public WebElement getHouseoffice() {
	  return houseoffice;
	   }

	   public WebElement getStreetInfo() {
	  return streetInfo;
	   }

	   public WebElement getLandmarkTf() {
	  return landmarkTf;
	   }
	   public WebElement getCountryDd() {
	    return countryDd;
	  }

	  public WebElement getStateDd() {
	    return stateDd;
	  }

	  public WebElement getCityDd() {
	    return cityDd;
	  }

	  public WebElement getPincodeTf() {
	    return pincodeTf;
	  }

	  public WebElement getPhoneNumber() {
	    return phoneNumber;
	  }

	  public WebElement getAddAddress() {
	    return addAddress;
	  }

	  @FindBy(id="Pincode")
	     private WebElement pincodeTf;
	     
	     @FindBy(xpath = "//input[contains(@id,'Phone Number')]")
	     private WebElement phoneNumber;
	     
	     @FindBy(xpath = "//button[text()='Add Address']")
	     private WebElement addAddress;
	  
	}