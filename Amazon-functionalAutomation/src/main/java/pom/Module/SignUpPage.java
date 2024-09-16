package pom.Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

@FindBy(xpath =(" "))
private WebElement userFirstName;

@FindBy(xpath=(""))
private WebElement moOREmailAdd;

@FindBy(xpath=(""))
private WebElement userPassword;

@FindBy(xpath=(""))
private WebElement signUppage;

public SignUpPage (WebDriver driver) {
	PageFactory.initElements(driver ,this);
}

public void sendFirstName() {
	userFirstName.sendKeys("etehdjdkdk");
			}
public void sendMoNo() {
	moOREmailAdd.sendKeys("3623748394034");
}

	public void SignUp() {
		userFirstName.sendKeys("etehdjdkdk");
		moOREmailAdd.sendKeys("3623748394034");
		 userPassword.sendKeys("jdfheifef");
		 signUppage.sendKeys("dhwdwsdso");
		
	}
	
}
