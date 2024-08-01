package com.ShopperStack.TestScript;

import org.testng.annotations.Test;

import com.ShopperStack_pom.My_Address;
import com.ShopperStack_pom.My_Profile;
import com.ShopperStalk_Generic_Utility.Base_Test;

public class Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test {
	@Test
	public void deleteAddress() throws InterruptedException  {
		homePage.getAccountSettings().click();
		homePage.getMyProfile().click();
		
		My_Profile myProfile =new My_Profile(driver);
		myProfile.getMyAddress().click();
		
		My_Address myAddress =new My_Address(driver);
		Thread.sleep(3000);
		
		myAddress.getDeleteBtn().click();
		Thread.sleep(3000);
		
		myAddress.getYesBtn().click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		

}
}
