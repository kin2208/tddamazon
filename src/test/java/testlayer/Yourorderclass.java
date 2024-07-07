package testlayer;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import basepackage.BaseCLASS;
import pompackage.PomYourOrderclass;

public class Yourorderclass {
	public class Yourordersclass extends BaseCLASS {
		
		PomYourOrderclass OrderPage1;

		public Yourordersclass() {
			super();
		}


		@BeforeMethod
		public void initsetup() {

			initiate();
			driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			OrderPage1 = new PomYourOrderclass(); 

		}
		
		@Test
		public void invalidnamemissing() {
			OrderPage1.typeyouremail("kinjalrajgor22@gmail.com");
			OrderPage1.clickcontinue();
			OrderPage1.typeyourpassword("kinjalrajgor23");
			OrderPage1.clickSignIn();
			OrderPage1.clickReturnsAndOrderLink();
			OrderPage1.clickNotYetShippedLink(); 
			OrderPage1.clickCancelledOrdersLink();
			OrderPage1.clickBuyAgainLink();
			OrderPage1.clickReturnsAndOrderLink();
			OrderPage1.selectTimeFilter("last30");
			OrderPage1.selectTimeFilter("year-2024");
			OrderPage1.selectTimeFilter("year-2023");
			OrderPage1.selectTimeFilter("months-3");
			OrderPage1.selectTimeFilter("archived");
			
			
			  
			 
		}
		
		

	}

}
