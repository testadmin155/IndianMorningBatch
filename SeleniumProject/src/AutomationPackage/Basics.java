package AutomationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aneesh\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://automationtestacademy.com");  //https://blazedemo.com/login
		driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle().equals("autotest"));
		String ActualTitle= driver.getTitle();
		String expectedTitle="Automationtest";
		if(ActualTitle.equals(expectedTitle))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
				
		driver.close();
		
		
		
	}

}
