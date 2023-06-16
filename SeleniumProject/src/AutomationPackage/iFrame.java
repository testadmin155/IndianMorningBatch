package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//switch to frame using ID
		//driver.switchTo().frame("singleframe");
		
		//switch to frame using Name
		//driver.switchTo().frame("SingleFrame");
		
		//switch to frame using index
		//driver.switchTo().frame(0);
		
		//switch to frame using WebElement
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
		
		//script to come out of the frame
		driver.switchTo().defaultContent();
		
		//Locator - linktext
		//whenever you find an element with anchor a <a, then you can use locator linktext
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		
		

	}

}
