package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://book.spicejet.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		Thread.sleep(1000);
		
		String value =driver.findElement(By.id("marketDate_2")).getAttribute("style");
		System.out.println(value);
		if(value.contains("0.5"))
		{
			System.out.println("Return Date is looking like disabled");
		}
		
		else
		
			{
				System.out.println("Return Date is looking like enabled");
			}
		

	}

}
