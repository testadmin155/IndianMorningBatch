package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;

public class MouseActions {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Actions mouse = new Actions(driver);
		
		//mouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		/*driver.findElement(By.xpath("//span[text()='Your Prime Video']")).click();
		
		System.out.println("After mouse Action : "+driver.getCurrentUrl());
		System.out.println("After mouse Action : "+driver.getTitle());
		*/
		
		//script to RightClick
		//mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Your Prime Video']"))).contextClick().perform();
		
		//Script to enter capital letters
		//mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").perform();
		
		//script to double click
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("electronics").doubleClick().perform();
		

	}

}
