package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseCLASS;



public class POMSIGNIN extends BaseCLASS {
	
	@FindBy(id = "ap_email") WebElement Email;
	@FindBy(id = "auth-error-message-box") WebElement InvalidEmailErrorMessage;
	@FindBy(id = "continue") WebElement ContinueButton;
	@FindBy(id = "ap_password") WebElement Password;
	@FindBy(id = "auth-error-message-box") WebElement WrongPasswordErrorMessage;
	@FindBy(id = "signInSubmit") WebElement SignInButton;
	
	public POMSIGNIN(){

		PageFactory.initElements(driver,this); 

	}

	public void typeyouremail(String youremail) {

		Email.sendKeys(youremail);

	}
	
	public boolean DisplayInvalidEmailAlert() {

		return InvalidEmailErrorMessage.isDisplayed();

	}
	
	public void clickcontinue() {

		ContinueButton.click();

	}
	
	public void typeyourpassword(String yourpassword) {

		Password.sendKeys(yourpassword);

	}
	
	public boolean DisplayWrongPasswordAlert() {

		return WrongPasswordErrorMessage.isDisplayed();

	}
	
	public void clickSignIn() {

		SignInButton.click();

	}
	
	

}
