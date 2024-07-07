package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseCLASS;
import pompackage.POMcreateaccount;

public class Createaccount extends BaseCLASS {

	 POMcreateaccount SignUp;

	public Createaccount() {
		super();
	}


	@BeforeMethod
	public  void initsetup() {

		initiate();
		driver.get("https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		SignUp = new POMcreateaccount(); 

	}
	
	@Test
	public void invalidnamemissing() {
		SignUp.typeyouremail("kinjalrajgor23@gmail.com");
		SignUp.typeyourpassword("kinjal23");
		SignUp.typeyourpasswordagain("kinjal23");
		SignUp.clickcontinue();
		Assert.assertTrue(SignUp.DisplayNameMissingAlert(), "Enter your name");
	}
	
	@Test
	public void invalidemailmissing() {
		SignUp.typeyourname("kinjal");
		SignUp.typeyourpassword("kinjal23");
		SignUp.typeyourpasswordagain("kinjal23");
		SignUp.clickcontinue();
		Assert.assertTrue(SignUp.DisplayEmailPhoneNoMissingAlert(), "Enter your e-mail address or mobile phone number");
	}
	
	@Test
	public void invalidemail() {
		SignUp.typeyourname("kinjal");
		SignUp.typeyouremail("kinjalrajgor");
		SignUp.typeyourpassword("kinjal23");
		SignUp.typeyourpasswordagain("kinjal23");
		SignUp.clickcontinue();
		Assert.assertTrue(SignUp.DisplayInvalidEmailAlert(), "Wrong or invalid e-mail address or mobile phone number. Please correct it and try again.");
	}
	
	@Test
	public void invalidpasswordmissing() {
		SignUp.typeyourname("kinjal");
		SignUp.typeyouremail("kinjalrajgor23@gmail.com");
		SignUp.typeyourpasswordagain("kinjal23");
		SignUp.clickcontinue();
		Assert.assertTrue(SignUp.DisplayPasswordMissingAlert(), "Minimum 6 characters required");
	}
	
	@Test
	public void invalidpasswordmismatch() {
		SignUp.typeyourname("kinjal");
		SignUp.typeyouremail("kinjalrajgor23@gmail.com");
		SignUp.typeyourpassword("kinjal23");
		SignUp.typeyourpasswordagain("kinjal24");
		SignUp.clickcontinue();
		Assert.assertTrue(SignUp.DisplayPasswordMismatchAlert(), "Passwords do not match");
	}

	@Test
	public void validcreateaccount() {
		SignUp.typeyourname("kinjal");
		SignUp.typeyouremail("kinjalrajgor23@gmail.com");
		SignUp.typeyourpassword("kinjal23");
		SignUp.typeyourpasswordagain("kinjal23");
		SignUp.clickcontinue();

	}

	@AfterMethod
	public void close() {
		quitBrowser();

	}

}