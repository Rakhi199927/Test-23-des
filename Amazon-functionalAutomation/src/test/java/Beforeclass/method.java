package Beforeclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class method {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforemethod");
		}

	@Test  (dependsOnMethods= ("test = 2"))
	public void test1() {
		System.out.println("test1");
	}
	
	@Test (priority= 2)
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=1 ,invocationCount = 2)
	public void test3() {
		System.out.println("test3");
	}
	
@AfterMethod
public void afterMethod() {
	System.out.println("aftermethod");
}

@AfterClass
public void afterClass() {
	System.out.println("afterClass");
}
}
