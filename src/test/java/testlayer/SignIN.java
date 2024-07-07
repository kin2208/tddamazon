package testlayer;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseCLASS;
import pompackage.POMSIGNIN;

public class SignIN extends BaseCLASS  {
	
	POMSIGNIN SignIn;
	
	public SignIN() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		

		initiate();
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		SignIn = new POMSIGNIN(); 

	}
	
	@Test
	public void invalidemail() {
		SignIn.typeyouremail("kinjalrajgor25@gmail.com");
		SignIn.clickcontinue();
		Assert.assertTrue(SignIn.DisplayInvalidEmailAlert(), "There was a problem");
	}
	
	@Test
	public void validemail() {
		SignIn.typeyouremail("kinjalrajgor22@gmail.com");
		SignIn.clickcontinue();
	}
	
	@Test
	public void invalidpassword() {
		SignIn.typeyouremail("kinjalrajgor22@gmail.com");
		SignIn.clickcontinue();
		SignIn.typeyourpassword("kinjal");
		SignIn.clickSignIn();
		Assert.assertTrue(SignIn.DisplayWrongPasswordAlert(),"There was a problem");
	}
	
	@Test
	public void validpassword() {
		SignIn.typeyouremail("kinjalrajgor22@gmail.com");
		SignIn.clickcontinue();
		SignIn.typeyourpassword("kinjalrajgor23");
		SignIn.clickSignIn();
		
	}
	
	@AfterMethod
	public void close() {
		quitBrowser();

	}


}