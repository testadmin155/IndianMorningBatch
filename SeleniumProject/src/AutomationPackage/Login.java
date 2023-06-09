package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;
	
	public void LoginMethod(String Username, String  Password)
	{
		driver.findElement(By.id("login1")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.id("login1")).clear();
		
		String ActualMessage ="Temporary Issue. Please try again later. [#5002]";
		String expectedMessqg=driver.findElement(By.id("div_login_error")).getText();
		if(ActualMessage.equals(expectedMessqg))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		Login obj = new Login();
		obj.LoginMethod("automationtestacademy","test@1234");
		obj.LoginMethod("Rajani", "testfor@123");
		obj.LoginMethod("Sravanthi", "Password@123");
		
		
		/*
		driver.findElement(By.id("login1")).sendKeys("Rajani");
		driver.findElement(By.id("password")).sendKeys("testfor@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.id("login1")).clear();
		
		driver.findElement(By.id("login1")).sendKeys("Sridevi");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.id("login1")).clear();
		
		driver.findElement(By.id("login1")).sendKeys("Sravanthi");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.id("login1")).clear();
		
		driver.findElement(By.id("login1")).sendKeys("Soujanya");
		driver.findElement(By.id("password")).sendKeys("Welcom@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.id("login1")).clear();
		
		driver.findElement(By.id("login1")).sendKeys("Tazeen");
		driver.findElement(By.id("password")).sendKeys("Welcome");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.id("login1")).clear();*/
	}

}
