package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//System.out.println(driver.getPageSource());
		
		/*driver.findElement(By.id("login1")).sendKeys("automationtestacademy");
		driver.findElement(By.id("password")).sendKeys("test@1234");
		driver.findElement(By.name("proceed")).click();*/
		
		//using X-path
		driver.findElement(By.xpath("//input[@id='login2']")).sendKeys("automationtestacademy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//*[@title='Sign in']")).click();
		
		
		//using CssSelector
		/*driver.findElement(By.cssSelector("input[type='text']")).sendKeys("automationtestacademy");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("Test@1234");
		driver.findElement(By.cssSelector("input[title='Sign in']")).click();*/
		
		/*driver.findElement(By.cssSelector("input#login1")).sendKeys("automationtestacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("Test@1234");
		driver.findElement(By.cssSelector("input.signinbtn")).click();*/
		
		
		
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

}
