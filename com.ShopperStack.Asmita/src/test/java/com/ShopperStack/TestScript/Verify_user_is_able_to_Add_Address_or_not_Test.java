// We can Store actions class,robot,takesScreenshots,select{All Webdriver}

package com.ShopperStack.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_pom.Address_Form_page;
import com.ShopperStack_pom.My_Address;
import com.ShopperStack_pom.My_Profile;
import com.ShopperStalk_Generic_Utility.Base_Test;

public class Verify_user_is_able_to_Add_Address_or_not_Test extends Base_Test{

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {   // We can Store actions class,robot,takesScreenshots,select
		homePage.getAccountSettings().click();
		homePage.getMyProfile().click();
		
		My_Profile myProfile =new My_Profile(driver);
		myProfile.getMyAddress().click();
		
		My_Address myAddress =new My_Address(driver);
		myAddress.getAddAddressbtn().click();
		
		Address_Form_page addressForm = new Address_Form_page(driver);
		addressForm.getOfficeTf().click();
		addressForm.getNameTf().sendKeys(file.readExcelData("Data2",1,0));
		addressForm.getHouseoffice().sendKeys(file.readExcelData("Data2",1,1));
		addressForm.getStreetInfo().sendKeys(file.readExcelData("Data2",1,2));
		addressForm.getLandmarkTf().sendKeys(file.readExcelData("Data2",1,3));
		
		addressForm.getCountryDd().sendKeys(file.readPropertyData("country"));
		//web.selectByValue(addressForm.getCountryDd(),file.readPropertyData("country"));
		addressForm.getStateDd().sendKeys(file.readPropertyData("state"));
		addressForm.getCityDd().sendKeys(file.readPropertyData("city"));
		
		addressForm.getPincodeTf().sendKeys(file.readExcelData("Data2",1,4));
		addressForm.getPhoneNumber().sendKeys(file.readExcelData("Data2",1,5));
		addressForm.getAddAddressBtn().click();
	}

}


