package ICICIBank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("I am code to execute Before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am code to execute aftersuite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I am code to execute beforetest");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("I am code to execute aftertest");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I am code to execute beforeclass");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("I am code to execute afterclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I am code to execute beforemethod");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I am code to execute aftermethod");
	}

}
