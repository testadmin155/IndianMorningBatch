package AutomationPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization extends BaseTest{

	public static void main(String[] args) {
		
		myDriver("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		/*
		 * Synchronization is a process to make both script and Application under test into sync
		
		There are 4 types od Synchronization
		
		1. Thread.sleep(5000);
		2. Implicit wait - Implicit wait time is applied on all elements as it id declared globally, no need to mention any conditions
		3. Explicit wait - Explicit wait is applied on particular elements, we need to specify condition for this
		4. Fluent Wait - Fluent wait is a wait in selenium in which we can give maximux of time to wait for specific condition with a polling time
		
		*/

		//Thread.sleep((5000);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		/*driver.findElement(By.id("display-other-button")).click();
		
		boolean btn = driver.findElement(By.id("hidden")).isDisplayed();
		System.out.println("Before Explicit wait : " + btn);
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
		
		
		boolean btn1 = driver.findElement(By.id("hidden")).isDisplayed();
		System.out.println("Before Explicit wait : " + btn1);
		*/
		
		//fluent wait
		FluentWait Fwait = new FluentWait(driver);
		Fwait.withTimeout(2, TimeUnit.MINUTES).pollingEvery(15, TimeUnit.SECONDS);
		
		
		
		
		
		
				
		
		
		
	}

}
