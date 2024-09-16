package Beforeclass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	private SoftAssert soft;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	 
	}

	@BeforeMethod
	public void beforeMethod () {
	System.out.println("beforeMethod");
	 soft = new SoftAssert();
	
	}
	
	@Test
	public void test1 () {
		System.out.println("test1");
	}
	
	@ Test
	public void VerifyHomePage () {
		System.out.println("test2");
		String actualURL = "www.facebook.com";
		String expectedURL ="www.facebook.com";
		
		String actualTital = "facebook";
		String expectedTital= "facebook";
		
		
		
		soft.assertEquals(actualURL, expectedURL);
		System.out.println("hello");
		soft.assertEquals(actualTital, expectedTital);
		
		soft.assertAll();
		
	}
	
	@ Test
	public void VerifySettingPage () {

		
		System.out.println("test3");
		String actualURL = "www.facebook.com";
		String expectedURL ="www.facebook.com";
		
		String actualTital = "facebook setting";
		String expectedTital= "facebook setting ";
		System.out.println("hello");
		
		
		soft.assertEquals(actualURL, expectedURL);
		System.out.println("hello");
		soft.assertEquals(actualTital, expectedTital);
		
		soft.assertAll();
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("afterclass");
	}
	
	@AfterMethod
	public void aftermethod () {
		System.out.println("afterMethod");
	}
}
