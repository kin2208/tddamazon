package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseCLASS;



public class PomYourOrderclass extends BaseCLASS {
	
	@FindBy(id = "ap_email") WebElement Email;
	@FindBy(id = "continue") WebElement ContinueButton;
	@FindBy(id = "ap_password") WebElement Password;
	@FindBy(id = "signInSubmit") WebElement SignInButton;
	@FindBy(id = "nav-orders") WebElement ReturnsAndOrderLink;
	@FindBy(id = "time-filter") WebElement timeFilterDropdown;
	@FindBy(linkText = "Buy Again") WebElement BuyAgainLink;
	@FindBy(linkText = "Not Yet Shipped") WebElement NotYetShippedLink;
	@FindBy(linkText = "Cancelled Orders") WebElement CancelledOrdersLink;
	
	
	public PomYourOrderclass(){

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
	
	public void clickReturnsAndOrderLink() {

		ReturnsAndOrderLink.click();

	}
	
	public void selectTimeFilter(String value) {
        Select timeFilter = new Select(timeFilterDropdown);
        timeFilter.selectByValue(value);
    }
	
	public void clickBuyAgainLink() {

		BuyAgainLink.click();

	}
	
	public void clickNotYetShippedLink() {

		NotYetShippedLink.click();

	}
	
	public void clickCancelledOrdersLink() {

		CancelledOrdersLink.click();

	}
	
	

}