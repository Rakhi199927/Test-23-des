package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgottenpage {
	
	@FindBy(xpath=("//table//td//div"))
	private WebElement Message;
	
	@FindBy(xpath=("//input[@type='text']"))
	private WebElement emailorPhone;
	
	@FindBy(xpath=("//button[text()='Search']"))
	private WebElement serahButton;
	

	@FindBy(xpath=("//a[text()='Cancel']"))
	private WebElement cancleButton;
	
	public forgottenpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getMessage() {
		return Message.getText();
	}
	public void sendEmailorPhoneNo(String userId) {
		emailorPhone.sendKeys("24333783899");
	}
	public void clickOnbutton() {
		serahButton.click();
	}

}
