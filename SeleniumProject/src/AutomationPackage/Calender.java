package AutomationPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	static WebDriver driver ;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		
		//script to click on departDate
		//driver.findElement(By.id("custom_date_picker_id_1")).click();
		//Forcible Action
		WebElement element = driver.findElement(By.id("custom_date_picker_id_1"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		String reqday="20";
		String reqmonth="November 2023";
		
		for(int headers=1;headers<=9;headers++)
		{

		String FirstHeader=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')]/div/div")).getText();
		System.out.println(FirstHeader);
		
		String SecondHeader = driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-last')]/div/div")).getText();
		System.out.println(SecondHeader);
		
		if(FirstHeader.equals(reqmonth))
		{
			List<WebElement> alldays = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group-first')] //a[contains(@class,'ui-state-default')]"));
			System.out.println(alldays.size());
			
			for(WebElement day:alldays)
			{
				System.out.println(day.getText());
				if(day.getText().equals(reqday))
				{
					day.click();
					break;
				}
			}
			
		}
		
		else if(SecondHeader.equals(reqmonth))
		{
			List<WebElement> alldays = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group-last')] //a[contains(@class,'ui-state-default')]"));
			System.out.println(alldays.size());
			
			for(WebElement day:alldays)
			{
				System.out.println(day.getText());
				if(day.getText().equals(reqday))
				{
					day.click();
					break;
				}
			}
		}
		
		else
		{
			driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-triangle-e')]")).click();
		}

	}
	}

}
