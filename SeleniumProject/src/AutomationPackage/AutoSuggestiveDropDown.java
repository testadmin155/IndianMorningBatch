package AutomationPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("From")).sendKeys("AH");
		Thread.sleep(3000);
		
		List<WebElement> fromoption = driver.findElements(By.xpath("//div[contains(@class,'airport-country-detail')]"));
		for (WebElement eachplace:fromoption)
		{
			System.out.println(eachplace.getText());
		  if(eachplace.getText().equals("Ludhiana, India, IN"))
			{
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", eachplace);
				break;
			}
		}
		

	}

}
