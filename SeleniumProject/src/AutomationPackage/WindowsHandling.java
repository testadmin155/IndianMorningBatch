package AutomationPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowsHandling extends BaseTest{

	public static void main(String[] args) {
		
		myDriver("https://demo.automationtesting.in/Windows.html");
		
		/*driver.findElement(By.xpath("//button[contains(@class,'btn-info')]")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		//System.out.println(parent);
		String child = it.next();
		//System.out.println(child);
		
		
		driver.switchTo().window(child);
		String message = driver.findElement(By.xpath("//div[contains(@class,'text-center')]/h1")).getText();
		System.out.println(message);
		
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[2]")).click();
		*/
		
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		System.out.println(parent);
		String child = it.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		String message = driver.findElement(By.xpath("//div[contains(@class,'text-center')]/h1")).getText();
		System.out.println(message);
		
		
		//driver.close();
		driver.quit();
		
		
		
		
		

	}

}
