package AutomationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	static WebDriver driver;
	
	static void validation(String ActualSelectedvalue, String ExpectedSelectedValue)
	{
		if(ActualSelectedvalue.equals(ExpectedSelectedValue))
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
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		
		
		//Script for Curr Dropdown
		/*Select obj = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		
		//script to check default value in Currency dropdown
		String ExpecteddefaultValue="INR";
		String Actualdefaultvalue = obj.getFirstSelectedOption().getText();
		if(Actualdefaultvalue.equals(ExpecteddefaultValue))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//obj.selectByValue("GBP");
		//obj.selectByIndex(5);
		obj.selectByVisibleText("USD");
		//script to check Selected value in Currency dropdown
				String ExpectedSelectedValue="USD";
				String ActualSelectedvalue = obj.getFirstSelectedOption().getText();
				if(ActualSelectedvalue.equals(ExpectedSelectedValue))
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
				*/
				
		
		//script to select Passangers
		String Actualdefaultvalue=driver.findElement(By.className("paxinfo")).getText();
		String ExpecteddefaultValue="1 Adult";
		if(Actualdefaultvalue.equals(ExpecteddefaultValue))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select Adult = new Select(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT")));
		Adult.selectByValue("3");
		
		Select Child = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		Child.selectByVisibleText("4");
		
		Select Infant = new Select(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_INFANT")));
		Infant.selectByValue("1");
		
		String ActualSelectedvalue=driver.findElement(By.className("paxinfo")).getText();
		String ExpectedSelectedValue="3 Adult, 4 Child, 1 Infant";
		
		validation(ActualSelectedvalue, ExpectedSelectedValue);
		
		
		//driver.close();
		

	}

}
