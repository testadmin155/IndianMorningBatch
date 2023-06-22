package ICICIBank;

import org.testng.Assert;
import org.testng.annotations.Test;


/*
 * 
verify the TestNg in Eclipse -- goto window --> preferences and look for TestNh
goto help --> Eclipse market place and search for testng and install it
download the testng jar and add to classpath - https://mvnrepository.com/artifact/org.testng/testng/6.7
add testng library from add library
 */

public class CarBuy extends Annotations{
	
	@Test
	public void CarBuywithWeb()
	{
		System.out.println("CarBuywithWeb");
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		Assert.assertEquals(c, 30);
		
	}
	
	@Test(dependsOnMethods = {"CarBuywithWeb"})
	public void CarBuywithAPP()
	{
		System.out.println("CarBuywithAPP");
	}
	
	@Test
	public void CarBuywithBranch()
	{
		System.out.println("CarBuywithBranch");
	}

}
