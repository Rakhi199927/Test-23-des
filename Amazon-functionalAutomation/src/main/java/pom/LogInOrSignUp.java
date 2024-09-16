package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInOrSignUp {

	//variable--private= Webelement
	@FindBy(xpath = ("//input[@name='email']"))
	private WebElement userName;
	
	@FindBy(xpath =("//input[@id='pass']"))
	private WebElement userPassword;
	
	@FindBy(xpath = ("//a[text()='Forgotten password?']"))
	private WebElement createNewAcc;
	
	//constructor = public = webelement initalize
	
public LogInOrSignUp (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//method --public = Action on WebElement

public void sendUserName(String userId) {
	userName.sendKeys(userId);
}		
	public void sendPassword(String userpassword) {
		userPassword.sendKeys(userpassword);
	}
	
	public void ClickOnNewAccount() {
		createNewAcc.click();
	}
	public void LogIn() {
		userName.sendKeys("velocity@.com");	
		userPassword.sendKeys("12345");
		createNewAcc.click();

	}
	
}

