package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseCLASS;



public class POMcreateaccount extends BaseCLASS {

	@FindBy(id = "ap_customer_name") WebElement Name;
	@FindBy(id = "ap_email") WebElement Email;
	@FindBy(id = "ap_password") WebElement Password;
	@FindBy(id = "ap_password_check") WebElement PasswordAgain;
	@FindBy(id = "continue") WebElement Continue;
	@FindBy(id = "auth-customerName-missing-alert") WebElement NameMissingAlert;
	@FindBy(id = "auth-email-invalid-claim-alert") WebElement InvalidEmailAlert;
	@FindBy(id = "auth-email-missing-alert") WebElement EmailPhoneNoMissingAlert;
	@FindBy(id = "auth-password-missing-alert") WebElement PasswordMissingAlert;
	@FindBy(id = "auth-passwordCheck-missing-alert") WebElement PasswordAgainMissingAlert;
	@FindBy(id = "auth-password-mismatch-alert") WebElement PasswordMismatchAlert;


	public POMcreateaccount(){

		PageFactory.initElements(driver,this); 

	}

	public void typeyourname(String yourname) {

		Name.sendKeys(yourname);

	}

	public void typeyouremail(String youremailid) {

		Email.sendKeys(youremailid);

	}

	public void typeyourpassword(String yourpassword) {

		Password.sendKeys(yourpassword);

	}

	public void typeyourpasswordagain(String yourpasswordagain) {

		PasswordAgain.sendKeys(yourpasswordagain);

	}

	public void clickcontinue() {

		Continue.click();

	}

	public boolean DisplayNameMissingAlert() {

		return NameMissingAlert.isDisplayed();

	}

	public boolean DisplayInvalidEmailAlert() {

		return InvalidEmailAlert.isDisplayed();

	}

	public boolean DisplayEmailPhoneNoMissingAlert() {

		return EmailPhoneNoMissingAlert.isDisplayed();

	}

	public boolean DisplayPasswordMissingAlert() {

		return PasswordMissingAlert.isDisplayed();

	}

	public boolean DisplayPasswordAgainMissingAlert() {

		return PasswordAgainMissingAlert.isDisplayed();

	}

	public boolean DisplayPasswordMismatchAlert() {

		return PasswordMismatchAlert.isDisplayed();

	}

}