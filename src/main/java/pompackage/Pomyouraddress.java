package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseCLASS;

public class Pomyouraddress extends BaseCLASS{
	@FindBy(id = "ap_email") WebElement Email;
	
	@FindBy(id = "continue") WebElement ContinueButton;
	@FindBy(id = "ap_password") WebElement Password;
	
	@FindBy(id = "signInSubmit") WebElement SignInButton;
	@FindBy(id = "nav-link-accountList") WebElement mousehover;
	@FindBy(xpath = "//a[@href='https://www.amazon.ca/a/addresses?ref_=ya_d_c_addr") WebElement yourorder;
	@FindBy(id = "ya-myab-address-add-link") WebElement Yourorder;
	

public Pomyouraddress(){

	PageFactory.initElements(driver,this); 

}

public void typeyouremail(String youremail) {

	Email.sendKeys(youremail);

}





public void clickcontinue() {

	ContinueButton.click();

}

public void typeyourpassword(String yourpassword) {
 
	Password.sendKeys(yourpassword);

}



public void clickSignIn() {

	SignInButton.click();

}
public void mousehover() {
	mousehover.click();
	
}
public void yourorder() {
	yourorder.click();
}
public void Yourorder() {
	Yourorder.click();
}
}