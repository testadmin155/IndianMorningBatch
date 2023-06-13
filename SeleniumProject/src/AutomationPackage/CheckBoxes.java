package AutomationPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();

		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();

		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();

		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();

		//Script to read the text of all the checkboxs
		String mydiscount="Unaccompanied Minor";
		List<WebElement> discounts = driver.findElements(By.xpath("//div[@id='divdiscountcheckbox']/div/div/p"));

		for (WebElement SingleOption:discounts)
		{

			System.out.println(SingleOption.getText());

			/*if(SingleOption.getText().equals(x)) //Family & Friends
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();

			}
			else if(SingleOption.getText().equals(x)) //Sr. Citizen
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
			}

			else if(SingleOption.getText().equals(x)) //Armed Forces
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
			}

			else if(SingleOption.getText().equals(x)) //LTC Fare
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();
			}

			else if(SingleOption.getText().equals(x)) //Govt. Employee
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp")).click();
			}

			else if(SingleOption.getText().equals(x)) //Student
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
			}

			else if(SingleOption.getText().equals(x)) //Unaccompanied Minor
			{
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_UNMR")).click();
			}*/

			if(SingleOption.getText().equals(mydiscount))
			{
			switch (SingleOption.getText())
			{
			case "Family & Friends":
				driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
				break;
				
		    case "Sr. Citizen":
			driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
			break;
			
	        case "Armed Forces":
		    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
		    break;
		    
	        case "LTC Fare":
	        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();
	        break;

	        case "Govt. Employee":
	        	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp")).click();
	        	break;
	        	
	        case "Student":
	        	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
	        	break;
	        	
	        case "Unaccompanied Minor":
	        	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_UNMR")).click();
	        	break;
	        	
	        default:
	        	System.out.println("No Matching discount");
	        	break;
	} 
			
			break;
			}
		} } }







