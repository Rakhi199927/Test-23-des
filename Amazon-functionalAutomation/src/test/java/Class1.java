import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LogInOrSignUp;
import pom.forgottenpage;

public class Class1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 LogInOrSignUp  logInOrSignUp = new  LogInOrSignUp(driver);
		 logInOrSignUp.sendUserName("velocity@.com");
		 logInOrSignUp.sendPassword("12345");
		 logInOrSignUp.ClickOnNewAccount();
		 
		 forgottenpage  forgottenpage = new  forgottenpage(driver);
		 
		String message =  forgottenpage.getMessage();
		if(message.equals("Please enter your email address or mobile number to search for your account.")) {
			
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		forgottenpage.clickOnbutton();
	}
}
