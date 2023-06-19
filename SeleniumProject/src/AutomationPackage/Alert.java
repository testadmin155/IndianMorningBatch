package AutomationPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Alert {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//script to handle Alert with OK Button
		/*driver.findElement(By.xpath("//button[contains(@class,'btn-danger')]")).click();
		String textmessqge = driver.switchTo().alert().getText();
		System.out.println(textmessqge);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
		
		
		//Script to hanle alert with Ok and Cancel
		driver.findElement(By.xpath("//ul[contains(@class,'nav-tabs')]/li[2]")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		String textmessage1= driver.switchTo().alert().getText();
		System.out.println(textmessage1);
		
		Thread.sleep(5000);
				
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);
		
		String message = driver.findElement(By.id("demo")).getText();
		
		System.out.println(message);
		
		//script to take screenshot
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(screenshot, new File ("E:\\Testing Session\\SeleniumTraining\\IndiaMorningBatch\\testing.png"));
		
		driver.close();
		
		
		

	}

}
