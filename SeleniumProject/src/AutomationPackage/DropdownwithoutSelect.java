package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithoutSelect {

	static WebDriver driver ;
	
	public void Places(String FromCity, String ToCity)
	{		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		String x = "//a[@value='"+FromCity+"']";
		System.out.println(x);
		driver.findElement(By.xpath("//a[@value='"+FromCity+"']")).click();
		//driver.findElement(By.xpath("//a[@value='"+ToCity+"']")).click();

		
		//Forcible Action
		WebElement element = driver.findElement(By.xpath("//a[@value='"+ToCity+"']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		
		DropdownwithoutSelect obj = new DropdownwithoutSelect();
		obj.Places("BLR", "SXR");
		driver.close();
		
		
		
		
	}

}
