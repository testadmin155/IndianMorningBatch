package ICICIBank;

import org.testng.annotations.Test;

public class CarLease extends Annotations{
	
	@Test(priority=1)
	public void CarLeasewithWeb()
	{
		System.out.println("CarLeasewithWeb");
	}
	
	@Test(priority=2)
	public void CarLeasewithAPP()
	{
		System.out.println("CarLeasewithAPP");
	}
	
	@Test (priority = 0)
	public void CarLeasewithBranch()
	{
		System.out.println("CarLeasewithBranch");
	}

}
