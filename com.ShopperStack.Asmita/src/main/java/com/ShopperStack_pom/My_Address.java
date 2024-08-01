package com.ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class My_Address {
    public My_Address(WebDriver driver) {
      PageFactory.initElements(driver , this);
    }
    
    @FindBy(xpath = "//button[text()='Add Address']")
    private WebElement addAddressbtn;
    
    @FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")
    //@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton')])[3]")
    private WebElement deleteBtn;
    
    @FindBy( xpath = "(//button[text()='Yes'])[1]")
    private WebElement yesBtn;

  public WebElement getAddAddressbtn() {
    return addAddressbtn;
  }

  public WebElement getDeleteBtn() {
    return deleteBtn;
  }

  public WebElement getYesBtn() {
    return yesBtn;
  }
    
}